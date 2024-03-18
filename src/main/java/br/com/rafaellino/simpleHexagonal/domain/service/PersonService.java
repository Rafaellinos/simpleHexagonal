package br.com.rafaellino.simpleHexagonal.domain.service;

import br.com.rafaellino.simpleHexagonal.domain.model.Person;

import java.util.List;

public interface PersonService {
  List<Person> getAll();

  Person getPersonByDocument(String document);
}
