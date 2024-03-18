package br.com.rafaellino.simpleHexagonal.domain.model;

public class Person {

  private Document document;
  private PersonType personType;
  private String name;

  public Person(Document document, PersonType personType, String name) {
    this.document = document;
    this.personType = personType;
    this.name = name;
  }

  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public PersonType getPersonType() {
    return personType;
  }

  public void setPersonType(PersonType personType) {
    this.personType = personType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
