package br.com.rafaellino.simpleHexagonal.domain.exception;

public class PersonNotFound extends RuntimeException {
  public PersonNotFound() {
    super();
  }

  public PersonNotFound(String message) {
    super(message);
  }
}
