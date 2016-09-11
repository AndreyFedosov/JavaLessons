package lesson4.homework;

public class ChinaBank extends Bank{
    public ChinaBank(Currency currency, long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(currency, id, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) return 100;
        else if (getCurrency() == Currency.EUR) return 150;
        else return 0; // if be other currency getLimitOfWithdrawal will be 0;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) return 5000;
        else if (getCurrency() == Currency.USD) return 10000;
        else return 0; // if be other currency getLimitOfFunding will be 0;
    }

    @Override
    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) return 1;
        else if (getCurrency() == Currency.EUR) return 0;
        else return 0; // if be other currency getMonthlyRate will be 0;
    }

    @Override
    public int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) commission = 3;
            else commission = 5;
        }
        else if (getCurrency() == Currency.EUR) {
            if (summ < 1000) commission = 10;
            else commission = 11;
        }
        else commission = 0; // if be other currency getCommission will be 0;
        return commission;
    }
}
