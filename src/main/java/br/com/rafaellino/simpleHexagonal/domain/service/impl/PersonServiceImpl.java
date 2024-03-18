package br.com.rafaellino.simpleHexagonal.domain.service.impl;

import br.com.rafaellino.simpleHexagonal.domain.exception.PersonNotFound;
import br.com.rafaellino.simpleHexagonal.domain.model.Person;
import br.com.rafaellino.simpleHexagonal.domain.repository.PersonRepository;
import br.com.rafaellino.simpleHexagonal.domain.service.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService {

  private final PersonRepository repository;

  public PersonServiceImpl(PersonRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Person> getAll() {
    return repository.findAll();
  }

  @Override
  public Person getPersonByDocument(final String document) {
    return repository.findByDocument(document).orElseThrow(PersonNotFound::new);
  }
}
