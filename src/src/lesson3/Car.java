package lesson3;

public class Car {
    int year;
    String model;
    int price;
    String nameOfTheOwner;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    Car(String model, int year, String nameOfTheOwner, int price) {
        this.year = year;
        this.nameOfTheOwner = nameOfTheOwner;
        this.price = price;
        this.model = model;
    }

    int test(int a){
       return a - 5;
    }

    int test(int a, int b){
        return a - b;
    }

    void printOwnerName(){
        System.out.println(nameOfTheOwner);
    }

    void printYear(){
        System.out.println(this.year);
    }


    public static void main(String[] args) {

    }


}
