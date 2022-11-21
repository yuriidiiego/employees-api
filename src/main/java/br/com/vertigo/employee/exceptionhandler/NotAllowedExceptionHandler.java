package br.com.vertigo.employee.exceptionhandler;

import static java.time.OffsetDateTime.now;
import static javax.ws.rs.core.Response.Status.METHOD_NOT_ALLOWED;
import static javax.ws.rs.core.Response.status;

import br.com.vertigo.employee.dto.ErrorDTO;
import javax.ws.rs.NotAllowedException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NotAllowedExceptionHandler
  implements ExceptionMapper<NotAllowedException> {

  @Override
  public Response toResponse(NotAllowedException exception) {
    return status(METHOD_NOT_ALLOWED)
      .entity(
        new ErrorDTO(
          "employees-api",
          METHOD_NOT_ALLOWED.getStatusCode(),
          now(),
          exception.getMessage()
        )
      )
      .build();
  }
}
