package lesson10.homework;

public class Exercise1  {
    public static void main(String[] args) {

        try
        {
            throw new Exception("Error");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I am in finnaly block");
        }

    }
}
