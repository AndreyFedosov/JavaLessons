package lesson6.homework;

import java.util.Arrays;

public final class ArraysUtils {


    public static int sum(int[] array){
        int result = 0;
        for (int item : array){
            result += item;
        }
        return result;
    }

    public static int min(int[] array){
        int result = array[0];
        for (int item : array){
            if (result > item) result = item;
        }
        return result;
    }

    public static int max(int[] array){
        int result = array[0];
        for (int item : array){
            if (result < item) result = item;
        }
        return result;
    }

    public static int maxPositive(int[] array){
        int result = 0;
        for (int item : array){
            if (result < item && item > 0) result = item;
        }
        return result;
    }

    public static int multiplication(int[] array){
        int result = 1;
        for (int  item : array){
            result *= item;
        }
        return result;
    }

    public static int modulus(int[] array){
        return array[0] % array[array.length-1];

    }

    public static int secondLargest(int[] array){
        int max = max(array);
        int result = array[0];

        for (int item : array){
            if (result < item && item < max) result = item;
        }
        return result;
    }

    public static int[] reverse(int[] array)
    {
        int[] reverse = new int[array.length];
        int arrayIndex =0;
        for (int i = array.length - 1 ; i>=0; i--)
        {
            reverse[arrayIndex] = array[i];
            arrayIndex++;
        }
        return reverse;
    }
    public static int[] findEvenElements(int[] array)
    {
        int[] moduleArray = array.clone();

        int arrayIndex = 0;
        for (int i = 0; i < moduleArray.length; i++)
        {
            moduleArray[i] = moduleArray[i]%2;
            if (moduleArray[i]==0) arrayIndex++;
        }

        int[] evenArrays = new int[arrayIndex];
        int index =0;
        for (int i=0; i < array.length; i++)
        {
            if (moduleArray[i] == 0) {
                evenArrays[index] = array[i];
                index++;
            }
        }

        return  evenArrays;
    }
}
