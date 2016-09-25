package lesson6.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] kkk = new int[]{1,2,3,4,5,6,7,8};

        int[] ret = ArraysUtils.findEvenElements(kkk);
        int[] rev = ArraysUtils.reverse(kkk);

        System.out.println(Arrays.toString(kkk));
        System.out.println(Arrays.toString(ret));
        System.out.println(Arrays.toString(rev));


        // ------------- users ----------------

        User[] users = new User[7];
        users[0] = new User(1,"Peter","Pan",400,1500);
        users[1] = new User(2,"John","Silver",750,100);
        users[2] = new User(3,"John","Flint",5600,12500);
        users[3] = new User(4,"Jack","Sparrow",4500,10100);
        users[4] = new User(5,"Edward","Teach",4750,9550);
        users[5] = new User(6,"John","Silver",750,100);
        users[6] = new User(7,"Peter","Pan",400,1500);

        User[] uniqueUsers = UserUtils.uniqueUsers(users);

        System.out.println("All users: " + Arrays.toString(users));
        UserUtils.paySalaryToUsers(users);
        System.out.println("All users + salary: " + Arrays.toString(users));

        User[] contitionalUsers = UserUtils.usersWithContitionalBalance(users,14600);
        System.out.println("All users with finding balance : " + Arrays.toString(contitionalUsers));

        System.out.println("All users: " + Arrays.toString(users));
        System.out.println("All unique users: " + Arrays.toString(uniqueUsers));

        long[] ids = UserUtils.getUsersId(users);
        System.out.println("All unique users: " + Arrays.toString(ids));

    }

}