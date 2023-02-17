package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void deleteUser(Long id);

    List<User> getAllUsers();

    void updateUser(User user);

    User getById(Long id);
}
