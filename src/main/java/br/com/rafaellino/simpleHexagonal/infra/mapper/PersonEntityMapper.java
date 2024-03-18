package br.com.rafaellino.simpleHexagonal.infra.mapper;

import br.com.rafaellino.simpleHexagonal.domain.model.Person;
import br.com.rafaellino.simpleHexagonal.infra.entity.PersonEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonEntityMapper {

  PersonEntity toPersonEntity(Person person);

  Person toPerson(PersonEntity personEntity);

  List<Person> toPersonList(List<PersonEntity> personEntityList);

}
