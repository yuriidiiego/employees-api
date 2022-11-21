package br.com.vertigo.employee.health;

import io.smallrye.health.checks.UrlHealthCheck;
import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.Readiness;

@ApplicationScoped
public class HerosHealthCheck {

  @ConfigProperty(name = "heros-api/mp-rest/url")
  String externalUrl;

  @Readiness
  HealthCheck checkURL() {
    return new UrlHealthCheck(externalUrl + "/heros")
      .name("Heros API")
      .requestMethod("GET")
      .statusCode(200);
  }
}
