package lesson10.homework.Exercise5;


public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        try {
            testClass.throwAllException();
        } catch (Exception e) {
            System.out.println("Catched all Exceptions");
        }

    }
}
