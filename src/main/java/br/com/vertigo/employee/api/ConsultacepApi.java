package br.com.vertigo.employee.api;

import javax.annotation.Generated;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/consultacep/{cep}")
@Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface ConsultacepApi {
  @GET
  @Produces({ "application/json" })
  Response consultaCep(@PathParam("cep") String cep);
}
