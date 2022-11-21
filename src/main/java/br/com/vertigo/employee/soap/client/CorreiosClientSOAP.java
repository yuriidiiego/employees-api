package br.com.vertigo.employee.soap.client;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.enterprise.context.ApplicationScoped;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

@ApplicationScoped
public class CorreiosClientSOAP {

  public AtendeCliente atendeClienteProxy() throws SigepClienteException {
    URL url;
    try {
      url = getTheWSDLUrl();
    } catch (Exception e) {
      throw new SigepClienteException(
        "Erro ao obter URL do WSDL do Correios",
        e
      );
    }
    QName qname = getNamespaceURI();

    Service service = createServiceWithWSDL(url, qname);
    return returnsProxyToTheService(service);
  }

  private AtendeCliente returnsProxyToTheService(Service service) {
    return service.getPort(AtendeCliente.class);
  }

  private Service createServiceWithWSDL(URL url, QName qname) {
    return Service.create(url, qname);
  }

  private QName getNamespaceURI() {
    return new QName(
      "http://cliente.bean.master.sigep.bsb.correios.com.br/",
      "AtendeClienteService"
    );
  }

  private URL getTheWSDLUrl() throws MalformedURLException {
    return new URL(
      "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl"
    );
  }
}
