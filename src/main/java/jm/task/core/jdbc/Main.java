package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

import static com.sun.xml.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl table = new UserServiceImpl();
        table.createUsersTable();

        table.saveUser("Salavat", "Kamaletdinov", (byte) 28);
        table.saveUser("Oleg", "Petrov", (byte) 27);
        table.saveUser("Ivan", "Ivanov", (byte) 26);

        List<User> list = table.getAllUsers();
        for (User user : list){
            System.out.println(user);
        }
        table.removeUserById(2);
        table.cleanUsersTable();
        table.dropUsersTable();

    }
}
