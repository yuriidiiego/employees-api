package br.com.vertigo.employee.exceptionhandler;

import static java.time.OffsetDateTime.now;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.status;

import br.com.vertigo.employee.dto.ErrorDTO;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.time.format.DateTimeParseException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class InvalidFormatExceptionMapper
  implements ExceptionMapper<InvalidFormatException> {

  @Override
  public Response toResponse(InvalidFormatException exception) {
    if (exception.getCause() instanceof DateTimeParseException) {
      return status(BAD_REQUEST)
        .entity(
          new ErrorDTO(
            "employees-api",
            BAD_REQUEST.getStatusCode(),
            now(),
            "Invalid date format, use dd/MM/yyyy"
          )
        )
        .build();
    }

    return status(BAD_REQUEST)
      .entity(
        new ErrorDTO(
          "employees-api",
          BAD_REQUEST.getStatusCode(),
          now(),
          "Invalid format"
        )
      )
      .build();
  }
}
