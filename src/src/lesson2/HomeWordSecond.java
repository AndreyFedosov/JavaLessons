package lesson2;

public class HomeWordSecond {
    public static double COMMISIONINPERCENT = 5;

    public static double withdrawBalance(double balance, double withdrawal) {

        return balance - withdrawal - (withdrawal*COMMISIONINPERCENT/100);
    }

    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 10;
        double withdrawBalance = withdrawBalance(balance,withdrawal);

        if (withdrawBalance >= 0) {
            System.out.println("Withdrawal: ОК, Commission is: " + (withdrawal*COMMISIONINPERCENT/100) + ", Balance is: " + withdrawBalance);
        } else {
            System.out.println("Withdrawal: NO. Please check your balance. Commission is " + COMMISIONINPERCENT + "% from payment");

        }

    }
}
