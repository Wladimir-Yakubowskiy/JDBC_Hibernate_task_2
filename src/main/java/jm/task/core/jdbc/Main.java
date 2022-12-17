package jm.task.core.jdbc;


import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


import java.util.List;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.dropUsersTable();
        userService.createUsersTable();

        userService.saveUser("Semen1", "Fedotov1", (byte) 25);
        userService.saveUser("Semen2", "Fedotov2", (byte) 26);
        userService.saveUser("Semen3", "Fedotov3", (byte) 27);
        userService.saveUser("Semen4", "Fedotov4", (byte) 28);


        List<User> users = userService.getAllUsers();

        for (User user : users) {
            System.out.println(user);
        }

        userService.removeUserById(3);

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
