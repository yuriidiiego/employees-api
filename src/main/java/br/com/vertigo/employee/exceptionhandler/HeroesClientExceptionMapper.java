package br.com.vertigo.employee.exceptionhandler;

import static java.time.OffsetDateTime.now;

import br.com.vertigo.employee.dto.ErrorDTO;
import br.com.vertigo.employee.exceptionhandler.customexception.HeroesClientException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class HeroesClientExceptionMapper
  implements ExceptionMapper<HeroesClientException> {

  @Override
  public Response toResponse(HeroesClientException exception) {
    return Response
      .status(Response.Status.INTERNAL_SERVER_ERROR)
      .entity(
        new ErrorDTO(
          "employees-api",
          Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(),
          now(),
          exception.getMessage()
        )
      )
      .build();
  }
}
