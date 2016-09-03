package lesson3.homework2;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        Adder adder = new Adder();
        System.out.println("The sum of A and B is " + adder.add(a,b));
        System.out.println("The " + a + " >= " + b + ". This is " + adder.check(a,b));


    }
}
