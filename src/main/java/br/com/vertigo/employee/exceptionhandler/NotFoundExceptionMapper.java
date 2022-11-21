package br.com.vertigo.employee.exceptionhandler;

import static java.time.OffsetDateTime.now;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static javax.ws.rs.core.Response.status;

import br.com.vertigo.employee.dto.ErrorDTO;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NotFoundExceptionMapper
  implements ExceptionMapper<NotFoundException> {

  @Override
  public Response toResponse(NotFoundException exception) {
    return status(NOT_FOUND)
      .entity(
        new ErrorDTO(
          "employees-api",
          NOT_FOUND.getStatusCode(),
          now(),
          exception.getMessage()
        )
      )
      .build();
  }
}
