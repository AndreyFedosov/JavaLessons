package lesson8.homework;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by AFedosov on 16.10.2016.
 */
public class Main {

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();

        User user1 = new User(1,"User1");
        User user2 = new User(2,"User2");
        User user3 = new User(3,"User3");
        User user4 = new User(4,"User4");
        User user5 = new User(5,"User5");

        list.add(user1);
        list.add(user2);
        list.add(user3);

        UserDAO userDAO = new UserDAO();
        userDAO.save(user5);
        System.out.println(userDAO.getList());

        userDAO.saveAll(list);
        System.out.println(userDAO.getList());

        userDAO.delete(user3);
        System.out.println(userDAO.getList());

        userDAO.delete(user3);
        System.out.println(userDAO.getList());

        userDAO.deleteAll(list);
        userDAO.save(user4);
        System.out.println(userDAO.getList());

        userDAO.deleteById((long)5);
        System.out.println(userDAO.getList());


        user2 = userDAO.get((long)4);
        System.out.println(user2);


    }
}
