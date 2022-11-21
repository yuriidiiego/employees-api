package br.com.vertigo.employee.service;

import br.com.vertigo.employee.dto.HeroResponseDTO;
import br.com.vertigo.employee.rest.client.HerosRestProxy;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class HerosService {

  @RestClient
  HerosRestProxy restProxy;

  public HeroResponseDTO getById(Integer id) {
    return restProxy.herosIdGet(id);
  }

  public List<HeroResponseDTO> getAll() {
    return restProxy.herosGet();
  }
}
