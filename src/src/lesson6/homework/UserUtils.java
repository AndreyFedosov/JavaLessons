package lesson6.homework;



public class UserUtils {



    public static User[] uniqueUsers(User[] users)
    {
        User[] uniqueUsers = new User[users.length];
        boolean userUnique;
            for (int i=0; i < users.length;i++)
            {
                userUnique = true;
                for (int k = 0; k < users.length; k++)
                {
                    if (users[i].equals(users[k]) & (users[i].getId() != users[k].getId()))
                        userUnique = false;
                }
                if (userUnique)
                    uniqueUsers[i]=users[i];
            }

        return deleteEmptyUsers(uniqueUsers);
    }
    public static User[] usersWithContitionalBalance(User[] users, int balance)
    {
        User[] contitiovalUsers = new User[users.length];
        int indexUser = 0;
        for (User user : users)
        {
            if (user.getBalance() == balance)
            {
                contitiovalUsers[indexUser] = user;
                indexUser++;
            }
        }
        return  deleteEmptyUsers(contitiovalUsers);
    }
    public static final User[] paySalaryToUsers(User[] users)
    {
        for (User user:users)
        {
            int balance = user.getBalance() + user.getSalary();
            user.setBalance(balance);
        }
        return users;
    }
    public static final long[] getUsersId(User[] users)
    {
        long[] indexes = new long[users.length];
        for (int i = 0; i<users.length; i++)
        {
            indexes[i] = users[i].getId();
        }
        return indexes;
    }
    public static User[] deleteEmptyUsers(User[] users)
    {
        User[] tempArray = new User[users.length];
        int i = 0;
        for (User user : users) {
            if (user != null)
            {
                tempArray[i] = user;
                i++;
            }
        }

        int indexArray = 0;
        User[] emptyUsersArray = new User[i];
        for (int k = 0;k < tempArray.length;k++ )
        {
            if (tempArray[k] != null) {
                emptyUsersArray[indexArray] = tempArray[k];
                indexArray++;
            }
        }

        return emptyUsersArray;

    }
}
