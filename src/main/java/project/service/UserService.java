package project.service;

import project.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void save(User user);
    public User show(long id);
    public void delete(long id);
    public void update(User user);
}
