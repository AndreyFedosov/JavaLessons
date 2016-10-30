package lesson10.homework;


public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        try {
            chechTestThrow("Error");
        }
        catch (Exercise2 e)
        {
            System.out.println(e.getString());
        }
        System.out.println("----------------------------");

        Exercise4 exercise4 = new Exercise4();
        try {
            exercise4.f();
        } catch (NullPointerException e)
        {
            System.out.println("NullPointerException");
        }
        System.out.println("----------------------------");

    }

    public static void chechTestThrow (String text) throws Exercise2
    {
        if (text == "Error")
        throw new Exercise2("Execrise2 Error message");
    }
}
