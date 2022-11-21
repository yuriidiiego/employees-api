package br.com.vertigo.employee.controller;

import static javax.ws.rs.core.Response.ok;

import br.com.vertigo.employee.api.HeroesApi;
import br.com.vertigo.employee.dto.HeroResponseDTO;
import br.com.vertigo.employee.service.HerosService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import lombok.AllArgsConstructor;

@AllArgsConstructor(onConstructor = @__(@Inject))
public class HerosController implements HeroesApi {

  private final HerosService service;

  @Override
  public Response getHeroes() {
    List<HeroResponseDTO> herosResponseDTO = service.getAll();
    return ok(herosResponseDTO).build();
  }

  @Override
  public Response getHero(Integer id) {
    HeroResponseDTO heroResponseDTO = service.getById(id);
    return ok(heroResponseDTO).build();
  }
}
