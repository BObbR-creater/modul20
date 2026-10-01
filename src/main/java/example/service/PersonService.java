package example.service;

import example.model.Person;

public interface PersonService {

    void createPerson(Person person);

    Person getPerson(Long id);

    void deletePerson(Long id);
}