package example.repository;

import example.model.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class AccountRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Account account) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();

        session.save(account);
        session.flush();

        trans.commit();
        session.close();
    }

    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Account getAcc = session.get(Account.class, id);
        if (getAcc != null) {
            session.delete(getAcc);
        }

        transaction.commit();
        session.close();
    }

    public Account get(Long id) {
        Session session = sessionFactory.openSession();
        Account account = session.get(Account.class, id);
        session.close();
        return account;
    }

}
