package ru.spring.service;

import org.springframework.transaction.annotation.Transactional;
import ru.spring.model.User;

import java.util.List;

public interface UserService {

    void add(User user);
    List<User> listUsers();
    User findById(long id);
    void deleteById(long id);
    void deleteAll();
    void update(User user);
}
