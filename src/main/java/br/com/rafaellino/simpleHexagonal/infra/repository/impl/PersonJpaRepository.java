package br.com.rafaellino.simpleHexagonal.infra.repository.impl;

import br.com.rafaellino.simpleHexagonal.domain.model.Person;
import br.com.rafaellino.simpleHexagonal.infra.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonJpaRepository extends JpaRepository<PersonEntity, Long> {

  PersonEntity findByDocument(final String document);

}
