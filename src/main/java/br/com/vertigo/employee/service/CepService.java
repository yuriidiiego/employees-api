package br.com.vertigo.employee.service;

import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import br.com.vertigo.employee.dto.EnderecoResponseDTO;
import br.com.vertigo.employee.exceptionhandler.customexception.CepServiceException;
import br.com.vertigo.employee.mapper.CepMapper;
import br.com.vertigo.employee.soap.client.CorreiosClientSOAP;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CepService {

  @Inject
  CorreiosClientSOAP correiosClientSOAP;

  @Inject
  CepMapper cepMapper;

  public EnderecoResponseDTO consultaCep(String cep) {
    return convertToDTOAndReturnConsultaCep(cep);
  }

  private EnderecoResponseDTO convertToDTOAndReturnConsultaCep(String cep) {
    try {
      return cepMapper.convertToDTO(
        correiosClientSOAP.atendeClienteProxy().consultaCEP(cep)
      );
    } catch (SigepClienteException | SQLException_Exception e) {
      throw new CepServiceException(e.getMessage());
    }
  }
}
