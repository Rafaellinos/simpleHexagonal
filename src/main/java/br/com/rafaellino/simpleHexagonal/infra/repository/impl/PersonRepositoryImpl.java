package br.com.rafaellino.simpleHexagonal.infra.repository.impl;

import br.com.rafaellino.simpleHexagonal.domain.model.Person;
import br.com.rafaellino.simpleHexagonal.domain.repository.PersonRepository;
import br.com.rafaellino.simpleHexagonal.infra.mapper.PersonEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonRepositoryImpl implements PersonRepository {

  private final PersonJpaRepository personJpaRepository;

  private final PersonEntityMapper mapper;

  @Override
  public Optional<Person> save(Person person) {
    var p = personJpaRepository.save(mapper.toPersonEntity(person));
    return Optional.of(mapper.toPerson(p));
  }

  @Override
  public List<Person> findAll() {
    var ps = personJpaRepository.findAll();
    return mapper.toPersonList(ps);
  }

  @Override
  public Optional<Person> findByDocument(String document) {
    return Optional.of(mapper.toPerson(personJpaRepository.findByDocument(document)));
  }
}
