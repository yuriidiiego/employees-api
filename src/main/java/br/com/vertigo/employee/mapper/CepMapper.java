package br.com.vertigo.employee.mapper;

import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.vertigo.employee.dto.EnderecoResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
  componentModel = "cdi",
  nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface CepMapper {
  @Mapping(source = "complemento2", target = "complemento")
  @Mapping(source = "end", target = "endereco")
  EnderecoResponseDTO convertToDTO(EnderecoERP consultaCEP);
}
