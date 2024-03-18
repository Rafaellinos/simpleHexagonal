package br.com.rafaellino.simpleHexagonal.domain.repository;

import br.com.rafaellino.simpleHexagonal.domain.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {

  Optional<Person> save(Person person);

  List<Person> findAll();

  Optional<Person> findByDocument(final String document);

}
