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

  @GET
  @Produces({"application/json"})
  Response employeesGet();

  @DELETE
  @Path("/{id}")
  @Produces({"application/json"})
  Response employeesIdDelete(@PathParam("id") Integer id);

  @GET
  @Path("/{id}")
  @Produces({"application/json"})
  Response employeesIdGet(@PathParam("id") Integer id);

  @PATCH
  @Path("/{id}")
  @Consumes({"application/json"})
  @Produces({"application/json"})
  Response employeesIdPatch(
      @PathParam("id") Integer id, @Valid @NotNull EmployeePatchDTO employeePatchDTO);

  @GET
  @Path("/{id}/summed-up")
  @Produces({"application/json"})
  Response employeesIdSummedUpGet(@PathParam("id") Integer id);

  @POST
  @Consumes({"application/json"})
  @Produces({"application/json"})
  Response employeesPost(@Valid @NotNull EmployeePostDTO employeePostDTO);
}
