package br.com.vertigo.employee.controller;

import static javax.ws.rs.core.Response.Status.CREATED;
import static javax.ws.rs.core.Response.Status.NO_CONTENT;
import static javax.ws.rs.core.Response.Status.OK;
import static javax.ws.rs.core.Response.status;

import br.com.vertigo.employee.api.EmployeesApi;
import br.com.vertigo.employee.dto.EmployeePatchDTO;
import br.com.vertigo.employee.dto.EmployeePostDTO;
import br.com.vertigo.employee.dto.EmployeeResponseDTO;
import br.com.vertigo.employee.dto.EmployeeSummedUpDTO;
import br.com.vertigo.employee.service.EmployeeService;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.core.Response;
import lombok.AllArgsConstructor;

@AllArgsConstructor(onConstructor = @__(@Inject))
public class EmployeeController implements EmployeesApi {

  private final EmployeeService service;

  @Override
  public Response getEmployees() {
    return status(OK).entity(service.getAll()).build();
  }

  @Override
  public Response deleteEmployee(Integer id) {
    service.delete(id);
    return status(NO_CONTENT).build();
  }

  @Override
  public Response getEmployee(Integer id) {
    EmployeeResponseDTO employee = service.getById(id);
    return status(OK).entity(employee).build();
  }

  @Override
  public Response updateEmployee(
    Integer id,
    @Valid @NotNull EmployeePatchDTO employeePatchDTO
  ) {
    EmployeeResponseDTO employee = service.updatePartially(
      id,
      employeePatchDTO
    );
    return status(OK).entity(employee).build();
  }

  @Override
  public Response createEmployee(
    @Valid @NotNull EmployeePostDTO employeePostDTO
  ) {
    return status(CREATED).entity(service.create(employeePostDTO)).build();
  }

  @Override
  public Response getEmployeeSummedUp(Integer id) {
    EmployeeSummedUpDTO employee = service.getSummedUpById(id);
    return status(OK).entity(employee).build();
  }
}
