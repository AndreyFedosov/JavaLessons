package lesson10.homework;


public class Exercise3 {
    public static void main(String[] args) {

        String string = null;

        try{
            string.trim();
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException");
        }

    }
}
