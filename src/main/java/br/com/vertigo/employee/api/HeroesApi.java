package br.com.vertigo.employee.api;

import javax.annotation.Generated;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/heroes")
@Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface HeroesApi {
  @GET
  @Path("/{id}")
  @Produces({ "application/json" })
  Response getHero(@PathParam("id") Integer id);

  @GET
  @Produces({ "application/json" })
  Response getHeroes();
}
