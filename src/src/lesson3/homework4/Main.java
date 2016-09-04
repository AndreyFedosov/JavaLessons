package lesson3.homework4;

public class Main {
    public static void main(String[] args) {
        User user = new User("Vasya",1000,5,"AlfaOmega",500,"USD");
        System.out.println(user.getBalance());
        user.paySalary();
        System.out.println(user.getBalance());


        user.withdraw(1100);
        System.out.println(user.getBalance());

        System.out.println(user.companyNameLenght());
        user.monthIncreaser(2);
        System.out.println(user.getMonthsOfEmployment());


    }
}
