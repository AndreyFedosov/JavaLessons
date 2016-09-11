package lesson4.homework;

public class Main {

    static void runMethods (BankSystem bankSystemImpl, User user1, User user2, int fundUser, int withdrawalUser, int transferUser)
    {
        System.out.println("------- Common --------");
        System.out.println(user1);
        System.out.println("-----------------------");
        bankSystemImpl.fundUser(user1,fundUser);
        bankSystemImpl.withdrawOfUser(user1,withdrawalUser);
        bankSystemImpl.transferMoney(user1,user2,transferUser);
        bankSystemImpl.paySalary(user1);
        System.out.println("------- Result --------");
        System.out.println(user1);
        System.out.println("-----------------------");
    }

   public static void main(String[] args) {
        Bank usBank = new USBank(Currency.USD,3,"USA",100,200,2,10000);
        Bank euBank = new EUBank(Currency.EUR,2,"Germany",50,250,1,20000);
        Bank chinaBank = new ChinaBank(Currency.USD,4,"China",300,10,1,40000);

        User userUsBank1 = new User(1,"Frank Sinatra",1000,6,"Frank Sinatra inc.",1000,usBank);
        User userUsBank2 = new User(2,"Madonna",500,12,"MadonnaStar",5000,usBank);
        User userEuBank1 = new User(3,"Princess Diana",600,60,"United Kindom",1000,euBank);
        User userEuBank2 = new User(4,"Cher",800,4,"BBC",500,euBank);
        User userChineBank1 = new User(5,"Kung Lao",200,2,"MortalCombats company",300,chinaBank);
        User userChineBank2 = new User(6,"PSY",2000,10,"GangGamStyile inc,",1000,chinaBank);


        BankSystem bankSystem = new BankSystemImpl();
        runMethods(bankSystem,userUsBank1,userUsBank2,1000,500,400);
        runMethods(bankSystem,userUsBank2,userUsBank1,30000,600,4400);
        runMethods(bankSystem,userEuBank1,userEuBank2,400,140,500);
        runMethods(bankSystem,userEuBank2,userEuBank1,5023,400,1400);
        runMethods(bankSystem,userChineBank1,userChineBank2,342,580,350);
        runMethods(bankSystem,userChineBank2,userChineBank1,250,50,700);

       // executing without runMethods
       /*
       System.out.println("--------- fundUser ----------");
        bankSystem.fundUser(userUsBank1,1000);
        bankSystem.fundUser(userUsBank2,30000);
        bankSystem.fundUser(userEuBank1,400);
        bankSystem.fundUser(userEuBank2,5023);
        bankSystem.fundUser(userChineBank1,342);
        bankSystem.fundUser(userChineBank2,250);
       System.out.println("---------- withdraw ---------");
        bankSystem.withdrawOfUser(userUsBank1,500);
        bankSystem.withdrawOfUser(userUsBank2,600);
        bankSystem.withdrawOfUser(userEuBank1,140);
        bankSystem.withdrawOfUser(userEuBank2,400);
        bankSystem.withdrawOfUser(userChineBank1,580);
        bankSystem.withdrawOfUser(userChineBank2,50);
       System.out.println("---------- paySalary ---------");
        bankSystem.paySalary(userUsBank1);
        bankSystem.paySalary(userUsBank2);
        bankSystem.paySalary(userEuBank1);
        bankSystem.paySalary(userEuBank2);
        bankSystem.paySalary(userChineBank1);
        bankSystem.paySalary(userChineBank2);
       System.out.println("---------- transfer ---------");
        bankSystem.transferMoney(userUsBank1,userUsBank2,400);
        bankSystem.transferMoney(userUsBank2,userUsBank1,4400);
        bankSystem.transferMoney(userEuBank1,userEuBank2,500);
        bankSystem.transferMoney(userEuBank2,userEuBank1,1400);
        bankSystem.transferMoney(userChineBank1,userChineBank2,350);
        bankSystem.transferMoney(userChineBank2,userChineBank1,700);
       System.out.println("----------------------------");
        System.out.println(userUsBank1);
        System.out.println(userUsBank2);
        System.out.println(userEuBank1);
        System.out.println(userEuBank2);
        System.out.println(userChineBank1);
        System.out.println(userChineBank2);
        */


    }

}
