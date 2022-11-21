package br.com.vertigo.employee.log;

import static java.time.OffsetDateTime.now;
import static java.time.format.DateTimeFormatter.ofPattern;
import static org.slf4j.LoggerFactory.getLogger;

import java.time.format.DateTimeFormatter;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.ext.Provider;
import org.jboss.resteasy.reactive.server.ServerResponseFilter;
import org.slf4j.Logger;

@Provider
public class LoggingFilter {

  protected final Logger logger = getLogger(super.getClass());

  private static final DateTimeFormatter FORMATTER = ofPattern(
    "dd/MM/yyyy-HH:mm:ss"
  );
  private static final String FORMAT = now().format(FORMATTER);

  @ServerResponseFilter
  public void filter(
    ContainerRequestContext requestContext,
    ContainerResponseContext responseContext,
    Throwable exception
  ) {
    int status = 400;
    if (responseContext.getStatus() >= status && logger.isWarnEnabled()) {
      logger.warn(
        "from=employees-api method={} endpoint={} statuscode={} timestamp={} message={}",
        requestContext.getMethod(),
        requestContext.getUriInfo().getRequestUri().getPath(),
        responseContext.getStatus(),
        FORMAT,
        "\"" + exception.getMessage() + "\""
      );
    } else if (logger.isInfoEnabled()) {
      logger.info(
        "from=employees-api method={} endpoint={} statuscode={} timestamp={}",
        requestContext.getMethod(),
        requestContext.getUriInfo().getRequestUri().getPath(),
        responseContext.getStatus(),
        FORMAT
      );
    }
  }
}
