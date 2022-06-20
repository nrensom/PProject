import project.dao.UserDao;
import project.dao.UserDaoImpl;
import project.entity.User;
import project.service.UserService;
import project.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService us = new UserServiceImpl();
        UserDao ud =new UserDaoImpl();
        ud.save(new User("ff", "ff", "ff",  5));


    }
}
