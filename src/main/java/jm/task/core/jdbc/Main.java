package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Асель", "Бекполот", (byte) 27);
        userService.saveUser("Мика", "Адилова", (byte) 58);
        userService.saveUser("Дженифер ", "Лопес", (byte) 40);
        userService.saveUser("Сакура", "Такеши", (byte) 32);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
