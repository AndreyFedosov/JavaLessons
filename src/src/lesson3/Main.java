package lesson3;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        Integer b =5;

        Car honda1 = new Car("Civik",2009);

        Car honda2 = new Car("Civik",2010, "Jack", 1000);

        honda1.printOwnerName();
        honda2.printOwnerName();

        honda1.printYear();
        honda2.printYear();
        System.out.println(" ");
        Phone phone = new Phone(1000,"5S","China");
        System.out.println(phone.getCost());
        System.out.println(phone.getOperatingSystem());
        phone.setOperatingSystem("IOS9");
        System.out.println(phone.getOperatingSystem());
        System.out.println("");
        Iphone iPhone = new Iphone(1000,"5S", "China");
        
    }
}
