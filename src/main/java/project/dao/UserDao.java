package project.dao;

import project.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public void save(User user);

    public void update(User user);

    public void delete(long id);

    public User getUser(long id);
}
