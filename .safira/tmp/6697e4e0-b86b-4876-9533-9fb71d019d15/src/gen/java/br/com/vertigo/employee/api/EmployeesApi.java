package br.com.vertigo.employee.api;

import br.com.vertigo.employee.dto.EmployeePatchDTO;
import br.com.vertigo.employee.dto.EmployeePostDTO;
import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/employees")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface EmployeesApi {

  @POST
  @Consumes({"application/json"})
  @Produces({"application/json"})
  Response createEmployee(@Valid @NotNull EmployeePostDTO employeePostDTO);

  @DELETE
  @Path("/{id}")
  @Produces({"application/json"})
  Response deleteEmployee(@PathParam("id") Integer id);

  @GET
  @Path("/{id}")
  @Produces({"application/json"})
  Response getEmployee(@PathParam("id") Integer id);

  @GET
  @Path("/{id}/summed-up")
  @Produces({"application/json"})
  Response getEmployeeSummedUp(@PathParam("id") Integer id);

  @GET
  @Produces({"application/json"})
  Response getEmployees();

  @PATCH
  @Path("/{id}")
  @Consumes({"application/json"})
  @Produces({"application/json"})
  Response updateEmployee(
      @PathParam("id") Integer id, @Valid @NotNull EmployeePatchDTO employeePatchDTO);
}
