package br.com.vertigo.employee.api;


import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/heroes/{id}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface HeroesApi {

  @GET
  @Produces({"application/json"})
  Response heroesIdGet(@PathParam("id") String id);
}
