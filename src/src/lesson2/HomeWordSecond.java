package lesson2;

public class HomeWordSecond {
    public static final double COMMISIONINPERCENT = 5;
    public static final double[] BALANCES = {1200, 250, 2000, 500, 3200};
    public static final String[] OWNERNAMES = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    public static double withdrawBalance(double balance, double withdrawal) {

        return balance - withdrawal - (withdrawal*COMMISIONINPERCENT/100);
    }

    public static double withdrawBalance(String ownerName, double withdrawal) {

        for (int i = 0; i < OWNERNAMES.length; i++) {
            if (OWNERNAMES[i].equals(ownerName))
            {
                return withdrawBalance(BALANCES[i],withdrawal);
            }
        }
        return -1;
    }

    public static double fundBalance(String ownerName, double fund) {

        for (int i = 0; i < OWNERNAMES.length; i++) {
            if (OWNERNAMES[i].equals(ownerName))
            {
                return BALANCES[i] + fund;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 10;
        double withdrawBalance = withdrawBalance(balance,withdrawal);

        String ownerName = "Ann";
        double sumOfWithdrawal = 100;

        //Homework 2.1
        if (withdrawBalance >= 0) {
            System.out.println("Withdrawal: ОК, Commission is: " + (withdrawal*COMMISIONINPERCENT/100) + ", Balance is: " + withdrawBalance);
        } else {
            System.out.println("Withdrawal: NO. Please check your balance. Commission is " + COMMISIONINPERCENT + "% from payment");
        }

        //Homework 2.2

        withdrawBalance = withdrawBalance(ownerName,sumOfWithdrawal);
        if (withdrawBalance >= 0) {
            System.out.println("Withdrawal: ОК, Sum of withdrawal is " + sumOfWithdrawal + ", Balance is: " + withdrawBalance);
        } else {
            System.out.println("Withdrawal: NO. Please check your balance. Commission is " + COMMISIONINPERCENT + "% from payment");
        }

        //Homework 2.3

        ownerName = "Oww";
        sumOfWithdrawal = 100;

        withdrawBalance = fundBalance(ownerName,sumOfWithdrawal);

        if ( withdrawBalance >= 0 ) {
            System.out.println(ownerName + " " + withdrawBalance);
        } else {
            System.out.println("Fund: NO. Please check your balance.");
        }




    }
}
