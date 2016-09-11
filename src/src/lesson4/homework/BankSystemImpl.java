package lesson4.homework;


public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        double commission = userBank.getCommission(amount);
        if ((userBank.getLimitOfWithdrawal() == -1) || (userBank.getLimitOfWithdrawal() >= amount + amount * commission/100)) {
            double newBalance = user.getBalance() - amount - amount * commission/100;
            if (newBalance >=0) {
                user.setBalance(newBalance);
                System.out.println("Операция разрешена. Коммиссия за снятие: " + commission + "%. Ваш баланс: " + user.getBalance());
            } else System.out.println("Недостаточно средств. Коммиссия: " + commission + "%. Ваш баланс: " + user.getBalance());
        } else System.out.println("Операция запрешена. Лимит операции снятия: " + userBank.getLimitOfWithdrawal());

    }

    @Override
    // void fundUser without commission
    public void fundUser(User user, int amount) {
        //if limit is ok - do funding - if no do nothing
        Bank userBank = user.getBank();
        if ((userBank.getLimitOfFunding() == -1) || (userBank.getLimitOfFunding() >= amount)) {
            double newBalance = user.getBalance() + amount;
            user.setBalance(newBalance);
            System.out.println("Операция разрешена. Ваш баланс: " + user.getBalance());
        } else System.out.println("Операция запрешена. Лимит операции пополняшки: " + userBank.getLimitOfFunding());

    }
    // void fundUser with commission
    /*
    public void fundUser(User user, int amount) {
        //if limit is ok - do funding - if no do nothing
        Bank userBank = user.getBank();
        double commission = userBank.getCommission(amount);
        if ((userBank.getLimitOfFunding() == -1) || (userBank.getLimitOfFunding() >= amount + amount * commission/100)) {
            double newBalance = user.getBalance() + amount - amount * commission/100;
            user.setBalance(newBalance);
            System.out.println("Операция разрешена. Коммиссия за пополнение: " + commission + "%. Ваш баланс: " + user.getBalance());
        } else System.out.println("Операция запрешена. Лимит операции пополняшки: " + userBank.getLimitOfFunding());

    }*/

    @Override
    // transferMoney without using methods
    public void transferMoney(User fromUser, User toUser, int amount) {
        //fromUser balance - amount - commission
        //toUser balance + amount

        Bank fromUserBank = fromUser.getBank();
        Bank toUserBank = toUser.getBank();

        double commission = fromUserBank.getCommission(amount);
        if ((fromUserBank.getLimitOfWithdrawal() == -1) || (fromUserBank.getLimitOfWithdrawal() >= amount + amount * commission/100)){
            double newBalanceFromUser = fromUser.getBalance() - amount - amount * commission/100;
            if (newBalanceFromUser >=0) {
                if ((toUserBank.getLimitOfFunding() == -1) || (toUserBank.getLimitOfFunding() >= amount)) {
                    double newBalanceToUser = toUser.getBalance() + amount;
                    fromUser.setBalance(newBalanceFromUser);
                    toUser.setBalance(newBalanceToUser);
                        System.out.println("Перевод осуществлен. Ваш баланс: " + fromUser.getBalance());
                        System.out.println("Вам на счет переведены средства. Ваш баланс: " + toUser.getBalance());
                } else System.out.println("Превышен лимит пополнения счета. Лимит: " + toUserBank.getLimitOfFunding());
            } else System.out.println("Недостаточно средств для перевода денег.");
        } else System.out.println("Превышен лимит снятия средств. Лимит: " + fromUserBank.getLimitOfWithdrawal());

    }
    /* transferMoney using methods.
    public void transferMoney(User fromUser, User toUser, int amount) {
        //fromUser balance - amount - commission
        //toUser balance + amount
        double currentBalance = fromUser.getBalance();
        withdrawOfUser(fromUser,amount);
        if (currentBalance != fromUser.getBalance()){
            fundUser(toUser, amount);
        } else System.out.println("Перевод отклонен");

    }
    */


    @Override
    public void paySalary(User user) {
        //user balance + salary - commission
        Bank userBank = user.getBank();

        double commission = userBank.getCommission(user.getSalary());
        // We haven't limits to pay salary.
        double newBalance = user.getBalance() + user.getSalary() - user.getSalary() * commission/100;
        user.setBalance(newBalance);
        System.out.println("Тебе пришла зарплата раб. Теперь твой баланс: " + user.getBalance());
    }
}
