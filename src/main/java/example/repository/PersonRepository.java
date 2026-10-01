package example.repository;

import example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Person person) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();

        session.save(person);
        session.flush();

        trans.commit();
        session.close();
    }

    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Person getPerson = session.get(Person.class, id);
        if (getPerson != null) {
            session.delete(getPerson);
        }

        transaction.commit();
        session.close();
    }

    public Person get(Long id) {
        Session session = sessionFactory.openSession();
        Person person = session.get(Person.class, id);
        session.close();
        return person;
    }

}