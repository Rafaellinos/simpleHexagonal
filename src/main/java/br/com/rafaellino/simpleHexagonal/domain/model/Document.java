package br.com.rafaellino.simpleHexagonal.domain.model;

import br.com.rafaellino.simpleHexagonal.domain.exception.InvalidDocumentException;

public class Document {
  private final String documentString;

  private void validateDocument() {
    if (this.documentString == null) {
      throw new InvalidDocumentException();
    }
    if (this.documentString.length() < 11 || this.documentString.length() > 14) {
      throw new InvalidDocumentException();
    }
  }

  public Document(final String documentString) {
    this.documentString = documentString;
    validateDocument();
  }

  public String getDocumentString() {
    return documentString;
  }

}
