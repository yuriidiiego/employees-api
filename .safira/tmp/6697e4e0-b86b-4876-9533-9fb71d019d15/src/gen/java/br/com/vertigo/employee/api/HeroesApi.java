package br.com.vertigo.employee.api;


import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/heroes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface HeroesApi {

  @GET
  @Path("/{id}")
  @Produces({"application/json"})
  Response getHero(@PathParam("id") Integer id);

  @GET
  @Produces({"application/json"})
  Response getHeroes();
}
