package lesson8.temp;

import java.util.Stack;

/**
 * Created by AFedosov on 16.10.2016.
 */
public class generickstack<E> {
    Stack <E> stk = new Stack<E>();
    public void push (E obj)
    {
        stk.push(obj);
    }
    public E pop()
    {
        E obj = stk.pop();
        return obj;
    }

}
class Output
{
    public static void main(String[] args) {
        generickstack<String> gs = new generickstack<String>();
        gs.push("Hello");
        System.out.println(gs.pop()+ " ");

    }
}

