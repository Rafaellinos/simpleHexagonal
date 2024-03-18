package br.com.rafaellino.simpleHexagonal.domain.model;

public enum PersonType {

  COMPANY("PJ"),
  INDIVIDUAL("PF");

  private final String abbreviation;

  PersonType(final String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getAbbreviation() {
    return abbreviation;
  }
}
