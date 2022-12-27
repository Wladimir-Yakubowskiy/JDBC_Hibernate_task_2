package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Semen1", "Petrov1", (byte) 22);
        userService.saveUser("Semen2", "Petrov2", (byte) 22);
        userService.saveUser("Semen3", "Petrov3", (byte) 22);

        userService.printAllUsers(userService.getAllUsers());
    }
}
