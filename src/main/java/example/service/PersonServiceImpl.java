package example.service;

import example.model.Person;
import example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void createPerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public Person getPerson(Long id) {
        return personRepository.get(id);
    }

    @Override
    public void deletePerson(Long id) {
        personRepository.delete(id);
    }
}