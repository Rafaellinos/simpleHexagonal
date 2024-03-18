package br.com.rafaellino.simpleHexagonal.domain.exception;

public class InvalidDocumentException extends RuntimeException {

  public InvalidDocumentException() {
    super();
  }

  public InvalidDocumentException(String message) {
    super(message);
  }
}
