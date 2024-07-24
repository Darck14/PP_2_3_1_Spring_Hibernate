package ru.spring.dao;

import ru.spring.model.User;

import java.util.List;

public interface UserDao {

   void add(User user);
   List<User> listUsers();
   User findById(long id);
   void deleteById(long id);
   void deleteAll();
   void update(long id, User user);

}
