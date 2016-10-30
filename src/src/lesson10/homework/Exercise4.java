package lesson10.homework;


public class Exercise4 {
    public void g() throws Exercise2 {
        throw new Exercise2("Exception");
    };
    public void f(){
        try {
            g();
        } catch (Exercise2 e)
        {
            System.out.println("Catch Exercise2 exception ");
            throw new NullPointerException();
        }

    }


}
