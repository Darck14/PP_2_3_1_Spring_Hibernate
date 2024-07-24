package ru.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.spring.dao.UserDao;
import ru.spring.model.User;

import java.util.List;

@Service
public class UserServiceimp implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User findById(long id) {
        return userDao.findById(id);
    }

//    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

//    @Transactional
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public void deleteById(long id) {
        userDao.deleteById(id);
    }

    @Override
    public void deleteAll() {
        userDao.deleteAll();
    }

    @Override
    public void update(long id, User user) {
        userDao.update(id, user);
    }
}
