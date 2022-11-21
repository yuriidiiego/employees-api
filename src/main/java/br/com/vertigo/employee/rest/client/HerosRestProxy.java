package br.com.vertigo.employee.rest.client;

import br.com.vertigo.employee.dto.HeroResponseDTO;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "heros-api")
@Path("/heros")
public interface HerosRestProxy {
  @GET
  @Produces({ "application/json" })
  List<HeroResponseDTO> herosGet();

  @GET
  @Path("/{id}")
  @Produces({ "application/json" })
  HeroResponseDTO herosIdGet(@PathParam("id") Integer id);
}
