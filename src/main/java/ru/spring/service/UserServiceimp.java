package ru.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.spring.dao.UserDao;
import ru.spring.model.User;

import java.util.List;

@Service
public class UserServiceimp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceimp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findById(long id) {
        return userDao.findById(id);
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }


    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
    @Transactional
    @Override
    public void deleteById(long id) {
        userDao.deleteById(id);
    }
    @Transactional
    @Override
    public void deleteAll() {
        userDao.deleteAll();
    }
    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
