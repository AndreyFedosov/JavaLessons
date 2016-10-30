package lesson10.homework.Exercise5;


public class TestClass {

    public void throwAllException() throws Exception {
            firstThrow();
            secondThrow();
            thirdThrow();
    }

    public void firstThrow() throws Exception
    {
        throw new FirstException();
    }
    public void secondThrow() throws Exception
    {
        throw new SecondException();
    }
    public void thirdThrow() throws Exception
    {
        throw new ThirdException();
    }


}
