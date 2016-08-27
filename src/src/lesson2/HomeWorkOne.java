package lesson2;

public class HomeWorkOne {

    public static double sum(double array[]){
        double result = 0;
        for (double item : array){
            result += item;
        }
        return result;
    }

    public static int sum(int array[]){
        int result = 0;
        for (int item : array){
            result += item;
        }
        return result;
    }

    public static double min(double array[]){
        double result = array[0];
        for (double item : array){
            if (result > item) result = item;
        }
        return result;
    }

    public static int min(int array[]){
        int result = array[0];
        for (int item : array){
            if (result > item) result = item;
        }
        return result;
    }

    public static double max(double array[]){
        double result = array[0];
        for (double item : array){
            if (result < item) result = item;
        }
        return result;
    }

    public static int max(int array[]){
        int result = array[0];
        for (int item : array){
            if (result < item) result = item;
        }
        return result;
    }

    public static double maxPositive(double array[]){
        double result = array[0];
        for (double item : array){
            if (result < item && item >0) result = item;
        }
        return result;

    }

    public static int maxPositive(int array[]){
        int result = array[0];
        for (int item : array){
            if (result < item && item > 0) result = item;
        }
        return result;
    }

    public static double multiplication(double array[]){
        double result = 1;
        for (double item : array){
            result *= item;
        }
        return result;
    }

    public static int multiplication(int array[]){
        int result = 1;
        for (int  item : array){
            result *= item;
        }
        return result;
    }

    public static double modulus(double array[]){
        return array[0] % array[array.length-1];
    }

    public static int modulus(int array[]){
        return array[0] % array[array.length-1];

    }

    public static double secondLargest(double array[]){
        double max = max(array);
        double result = array[0];

        for (double item : array){
            if (result < item && item < max) result = item;
        }
        return result;

    }

    public static int secondLargest(int array[]){
        int max = max(array);
        int result = array[0];

        for (int item : array){
            if (result < item && item < max) result = item;
        }
        return result;
    }

    public static void main(String[] args) {
        double[] MyDoubleArray = {1, 44.2, -2 ,10.5 ,16.2 ,-5.25 ,25, 41.2, -42.3, 15.2};
        int[] MyIntArray = {32, -15, 42, 4, -1, -15, 24, 53, 16, 51};


        System.out.println("Value Sum of double's elements is : " + sum(MyDoubleArray));
        System.out.println("Value Sum of int's elements is : " + sum(MyIntArray));

        System.out.println("Value Min of double's elements is : " + min(MyDoubleArray));
        System.out.println("Value Min of int's elements is : " + min(MyIntArray));

        System.out.println("Value Max of double's elements is : " + max(MyDoubleArray));
        System.out.println("Value Max of int's elements is : " + max(MyIntArray));

        System.out.println("Value MaxPositive of double's elements is : " + maxPositive(MyDoubleArray));
        System.out.println("Value MaxPositive of int's elements is : " + maxPositive(MyIntArray));

        System.out.println("Value Multiplication of double's elements is : " + multiplication(MyDoubleArray));
        System.out.println("Value Multiplication of int's elements is : " + multiplication(MyIntArray));

        System.out.println("Value Modulus of double's elements is : " + modulus(MyDoubleArray));
        System.out.println("Value Modulus of int's elements is : " + modulus(MyIntArray));

        System.out.println("Value SecondLargest of double's elements is : " + secondLargest(MyDoubleArray));
        System.out.println("Value SecondLargest of int's elements is : " + secondLargest(MyIntArray));

    }


}
