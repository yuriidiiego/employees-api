package br.com.vertigo.employee.exceptionhandler.customexception;

public class HeroesClientException extends RuntimeException {

  public HeroesClientException(String message) {
    super(message);
  }
}
