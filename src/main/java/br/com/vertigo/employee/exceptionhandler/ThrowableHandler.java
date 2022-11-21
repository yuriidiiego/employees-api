package br.com.vertigo.employee.exceptionhandler;

import static java.time.OffsetDateTime.now;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.status;

import br.com.vertigo.employee.dto.ErrorDTO;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ThrowableHandler implements ExceptionMapper<Throwable> {

  @Override
  public Response toResponse(Throwable exception) {
    return status(INTERNAL_SERVER_ERROR)
      .entity(
        new ErrorDTO(
          "employees-api",
          INTERNAL_SERVER_ERROR.getStatusCode(),
          now(),
          exception.getMessage()
        )
      )
      .build();
  }
}
