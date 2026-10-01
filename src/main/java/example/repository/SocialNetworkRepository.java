package example.repository;

import example.model.SocialNetwork;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SocialNetworkRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(SocialNetwork socialNetwork) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();

        session.save(socialNetwork);
        session.flush();

        trans.commit();
        session.close();
    }

    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        SocialNetwork getSocialNetwork = session.get(SocialNetwork.class, id);
        if (getSocialNetwork != null) {
            session.delete(getSocialNetwork);
        }

        transaction.commit();
        session.close();
    }

    public SocialNetwork get(Long id) {
        Session session = sessionFactory.openSession();
        SocialNetwork socialNetwork = session.get(SocialNetwork.class, id);
        session.close();
        return socialNetwork;
    }

}