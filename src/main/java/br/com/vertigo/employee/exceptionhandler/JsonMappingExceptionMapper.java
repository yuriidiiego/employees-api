package br.com.vertigo.employee.exceptionhandler;

import static java.time.OffsetDateTime.now;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.status;

import br.com.vertigo.employee.dto.ErrorDTO;
import com.fasterxml.jackson.databind.JsonMappingException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class JsonMappingExceptionMapper
  implements ExceptionMapper<JsonMappingException> {

  @Override
  public Response toResponse(JsonMappingException exception) {
    return status(BAD_REQUEST)
      .entity(
        new ErrorDTO(
          "employees-api",
          BAD_REQUEST.getStatusCode(),
          now(),
          exception.getMessage()
        )
      )
      .build();
  }
}
