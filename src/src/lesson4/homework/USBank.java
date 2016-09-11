package lesson4.homework;

public class USBank extends Bank{
    public USBank(Currency currency, long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(currency, id, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) return 1000;
        else if (getCurrency() == Currency.EUR) return 1200;
        else return 0; // if be other currency getLimitOfWithdrawal will be 0;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) return 10000;
        else if (getCurrency() == Currency.USD) return -1; // if -1 it will be unlimited operation.
        else return 0; // if be other currency getLimitOfFunding will be -1;
    }

    @Override
    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) return 1;
        else if (getCurrency() == Currency.EUR) return 2;
        else return 0; // if be other currency getMonthlyRate will be 0;
    }

    @Override
    public int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) commission = 5;
            else commission = 7;
        }
        else if (getCurrency() == Currency.EUR) {
            if (summ < 1000) commission = 6;
            else commission = 8;
        }
        else commission = 0; // if be other currency getCommission will be 0;
        return commission;
    }
}
