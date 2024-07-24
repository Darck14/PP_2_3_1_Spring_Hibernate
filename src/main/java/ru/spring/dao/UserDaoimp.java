package ru.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
import ru.spring.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class UserDaoimp implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public void add(User user) {
        em.persist(user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
        TypedQuery<User> query = em.createQuery("select u from User u", User.class);
        return query.getResultList();
    }

    @Override
    public User findById(long id) {
        return em.find(User.class, id);
    }

    @Transactional
    @Override
    public void deleteById(long id) {
        em.remove(em.find(User.class, id));
    }

    @Transactional
    @Override
    public void deleteAll() {
        em.createQuery("delete from User").executeUpdate();
    }

    @Transactional
    @Override
    public void update(long id, User user) {
        User u = findById(id);
        u.setName(user.getName());
        u.setSername(user.getSername());
        u.setSex(user.getSex());
        add(u);
    }
}
