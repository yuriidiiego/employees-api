package br.com.vertigo.employee.service;

import br.com.vertigo.employee.dto.EmployeePatchDTO;
import br.com.vertigo.employee.dto.EmployeePostDTO;
import br.com.vertigo.employee.dto.EmployeeResponseDTO;
import br.com.vertigo.employee.dto.EmployeeSummedUpDTO;
import br.com.vertigo.employee.mapper.EmployeeMapper;
import br.com.vertigo.employee.model.EmployeeModel;
import br.com.vertigo.employee.repository.EmployeeRepository;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;
import lombok.AllArgsConstructor;

@ApplicationScoped
@AllArgsConstructor(onConstructor = @__(@Inject))
public class EmployeeService {

  private final EmployeeRepository repository;
  private final EmployeeMapper mapper;

  public List<EmployeeResponseDTO> getAll() {
    return mapper.toListDTO(repository.listAll());
  }

  public EmployeeSummedUpDTO getSummedUpById(Integer id) {
    return mapper.toDTO(getById(id));
  }

  public EmployeeResponseDTO getById(Integer id) {
    return mapper.toResponseDTO(findByIdOrThrowException(id));
  }

  @Transactional
  public EmployeeResponseDTO updatePartially(
    Integer id,
    EmployeePatchDTO employeePatchDTO
  ) {
    EmployeeModel employeeModel = findByIdOrThrowException(id);
    convertEmployeePatchDTOtoEployeeModel(employeePatchDTO, employeeModel);
    return returnModelConvertedToResponseDTO(employeeModel);
  }

  @Transactional
  public void delete(Integer id) {
    findByIdOrThrowException(id);
    repository.deleteById(id);
  }

  @Transactional
  public EmployeeResponseDTO create(EmployeePostDTO employeePostDTO) {
    EmployeeModel employee = convertEmployeePostDTOtoModel(employeePostDTO);
    repository.persist(employee);
    return returnModelConvertedToResponseDTO(employee);
  }

  private EmployeeModel convertEmployeePostDTOtoModel(
    EmployeePostDTO employeePostDTO
  ) {
    return mapper.toModel(employeePostDTO);
  }

  private void convertEmployeePatchDTOtoEployeeModel(
    EmployeePatchDTO employeePatchDTO,
    EmployeeModel employeeModel
  ) {
    mapper.toModel(employeePatchDTO, employeeModel);
  }

  private EmployeeResponseDTO returnModelConvertedToResponseDTO(
    EmployeeModel employeeModel
  ) {
    return mapper.toResponseDTO(employeeModel);
  }

  private EmployeeModel findByIdOrThrowException(Integer id) {
    return repository
      .findByIdOptional(id)
      .orElseThrow(
        () -> new NotFoundException("Employee not found with id: " + id)
      );
  }
}
