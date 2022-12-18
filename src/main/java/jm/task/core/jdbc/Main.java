package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.util.List;


public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Semen1", "Petrov1", (byte) 22);
        userDao.saveUser("Semen2", "Petrov2", (byte) 22);
        userDao.saveUser("Semen3", "Petrov3", (byte) 22);

        UserDao userDao1 = new UserDaoJDBCImpl();


        for (User user : userDao1.getAllUsers()) {
            System.out.println(user);
        }
    }
}
