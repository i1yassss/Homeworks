package com.hellogwt.server.repository.impl;

import com.hellogwt.server.repository.GreetingRepository;
import com.hellogwt.shared.domain.Greeting;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Ilyas on 30.05.2016.
 */
@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void deleteByText(String text) {
        Query query = em.createNativeQuery("DELETE * FROM greetings WHERE  text = ?", Greeting.class);
        query.setParameter(1, text);
        query.executeUpdate();
    }

    @Override
    public List<Greeting> findAll() {
        Query query = em.createNativeQuery("SELECT * FROM greetings", Greeting.class);
        return query.getResultList();
    }

    @Override
    public Greeting findOneByText(String text) {
        Query query = em.createNativeQuery("SELECT * from users where text = ?;", Greeting.class);
        query.setParameter(1, text);
        return (Greeting) query.getSingleResult();
    }

    @Override
    @Transactional
    public void save(Greeting greeting) {
        em.persist(greeting);
    }
}
