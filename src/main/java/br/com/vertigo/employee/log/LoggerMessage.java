package br.com.vertigo.employee.log;

import static java.lang.String.format;
import static java.time.format.DateTimeFormatter.ofPattern;

import java.time.LocalDateTime;
import javax.ws.rs.core.Response.Status;

public class LoggerMessage {

  public static String utilMessage(
    String method,
    String endpoint,
    Status status
  ) {
    return format(
      "method=%s endpoint=%s timestamp=%s status=%s",
      method,
      endpoint,
      LocalDateTime.now().format(ofPattern("dd/MM/yyyy-HH:mm:ss")),
      status
    );
  }
}
