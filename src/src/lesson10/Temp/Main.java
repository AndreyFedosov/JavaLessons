package lesson10.Temp;

/**
 * Created by AFedosov on 30.10.2016.
 */
class Test
{
    public static void main(String[] args) {
        try
        {
            int a[] = {1,2,3,4};
            for (int i = 1; i<=4; i++){
            System.out.println("a" + a[i] + "\n");
            }
        }
        catch (Exception e)
        {
            System.out.println("ssss");
        }


    }
}
