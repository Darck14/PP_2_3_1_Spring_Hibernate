package ru.spring.dao;

import org.springframework.stereotype.Repository;

import ru.spring.model.User;

import javax.persistence.*;
import java.util.List;


@Repository
public class UserDaoimp implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void add(User user) {
        em.persist(user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
        return em.createQuery("from User").getResultList();
    }

    @Override
    public User findById(long id) {
        return em.find(User.class, id);
    }

    @Override
    public void deleteById(long id) {
        em.createQuery("delete from User user where user.id = :id").setParameter("id", id).executeUpdate();
    }

    @Override
    public void deleteAll() {
        em.createQuery("delete from User").executeUpdate();
    }

    @Override
    public void update(User user) {
        em.merge(user);
    }
}
