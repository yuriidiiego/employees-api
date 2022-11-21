package br.com.vertigo.employee.api;


import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/consultaCep/{cep}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface ConsultaCepApi {

  @GET
  @Produces({"application/json"})
  Response consultaCepCepGet(@PathParam("cep") String cep);
}
