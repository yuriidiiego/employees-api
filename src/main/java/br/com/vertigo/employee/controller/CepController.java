package br.com.vertigo.employee.controller;

import static javax.ws.rs.core.Response.Status.OK;
import static javax.ws.rs.core.Response.status;

import br.com.vertigo.employee.api.ConsultacepApi;
import br.com.vertigo.employee.dto.EnderecoResponseDTO;
import br.com.vertigo.employee.service.CepService;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import lombok.AllArgsConstructor;

@AllArgsConstructor(onConstructor = @__(@Inject))
public class CepController implements ConsultacepApi {

  private final CepService cepService;

  @Override
  public Response consultaCep(String cep) {
    EnderecoResponseDTO enderecoResponseDTO = cepService.consultaCep(cep);
    return status(OK).entity(enderecoResponseDTO).build();
  }
}
