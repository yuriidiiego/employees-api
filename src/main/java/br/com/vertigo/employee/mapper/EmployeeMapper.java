package br.com.vertigo.employee.mapper;

import br.com.vertigo.employee.dto.EmployeePatchDTO;
import br.com.vertigo.employee.dto.EmployeePostDTO;
import br.com.vertigo.employee.dto.EmployeeResponseDTO;
import br.com.vertigo.employee.dto.EmployeeSummedUpDTO;
import br.com.vertigo.employee.model.EmployeeModel;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
  componentModel = "cdi",
  nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface EmployeeMapper {
  @Mapping(target = "id", ignore = true)
  EmployeeModel toModel(EmployeePostDTO employeePostDTO);

  // @IterableMapping é necessário para o MapStruct reconhecer o método como um mapeamento de lista.
  // Porém você precisa criar um método para cada tipo de lista que você deseja mapear.

  List<EmployeeResponseDTO> toListDTO(List<EmployeeModel> employeeModels);

  @Mapping(target = "nome", source = "firstName")
  @Mapping(target = "sobreNome", source = "lastName")
  EmployeeSummedUpDTO toDTO(EmployeeResponseDTO employeeResponseDTO);

  EmployeeModel toModel(
    EmployeePatchDTO employeePatchDTO,
    @MappingTarget EmployeeModel employeeModel
  );

  EmployeeResponseDTO toResponseDTO(EmployeeModel employeeModel);
}
