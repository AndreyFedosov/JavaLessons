package lesson4.homework;
/**
Create interface BankSystem with methods:

        void withdrawOfUser(User user, int amount)
        void fundUser(User user, int amount)
        void transferMoney(User fromUser, User toUser, int amount)
        void paySalary(User user)

        And its implementation*/
public interface BankSystem {

    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);

}
