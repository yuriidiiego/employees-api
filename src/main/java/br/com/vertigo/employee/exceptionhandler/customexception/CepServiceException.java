package br.com.vertigo.employee.exceptionhandler.customexception;

public class CepServiceException extends RuntimeException {

  public CepServiceException(String message) {
    super(message);
  }
}
