package lesson7.homework;


//Generate Integer and String ArrayList and LinkedList with 1000 and 10000 elements. Measure time of execution of the following methods and print it to console:
//        - add
//        - set
//        - get
//        - remove

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class MainTestClass {
    private static void testerInt(List<Integer> list,int cnt, String text)
    {
        tesIntAdd(list,cnt,text);
        tesIntSet(list,cnt,text);
        tesIntGet(list,cnt,text);
        tesIntRem(list,cnt,text);

    }

    private static void testerStr(List<String> list,int cnt, String text)
    {
        tesStrAdd(list,cnt,text);
        tesStrSet(list,cnt,text);
        tesStrGet(list,cnt,text);
        tesStrRem(list,cnt,text);

    }

    private static void tesIntAdd(List<Integer> list,int cnt, String text)
    {
        long start = System.currentTimeMillis();
        for (int i = 0; i < cnt; i++) {
            list.add((int) Math.random() * 1000);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Add " + text + " test " + cnt + " " + (finish - start )+ "ms");
    }

    private static void tesIntGet(List<Integer> list,int cnt, String text)
    {
        long start = System.currentTimeMillis();
        for (int i = 0; i < cnt; i++) {
            int val = list.get(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Get " + text + " test " + cnt + " " + (finish - start )+ "ms");
    }

    private static void tesIntSet(List<Integer> list,int cnt, String text)
    {
        long start = System.currentTimeMillis();
        for (int i = 0; i < cnt; i++) {
            list.set(i,(int) (Math.random() * 1000));
        }
        long finish = System.currentTimeMillis();
        System.out.println("Set " + text + " test " + cnt + " " + (finish - start )+ "ms");
    }

    private static void tesIntRem(List<Integer> list,int cnt, String text)
    {
        long start = System.currentTimeMillis();
        for (int i = cnt - 1; i >=0; i--) {
            list.remove(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Remove " + text + " test " + cnt + " " + (finish - start )+ "ms");
    }

    private static void tesStrAdd(List<String> list,int cnt, String text)
    {
        long start = System.currentTimeMillis();
        for (int i = 0; i < cnt; i++) {
            list.add(String.valueOf(Math.random() * 1000));
        }
        long finish = System.currentTimeMillis();
        System.out.println("Add " + text + " test " + cnt + " " + (finish - start )+ "ms");
    }

    private static void tesStrGet(List<String> list,int cnt, String text)
    {
        long start = System.currentTimeMillis();
        for (int i = 0; i < cnt; i++) {
            String val = list.get(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Get " + text + " test " + cnt + " " + (finish - start )+ "ms");
    }

    private static void tesStrSet(List<String> list,int cnt, String text)
    {
        long start = System.currentTimeMillis();
        for (int i = 0; i < cnt; i++) {
            list.set(i,String.valueOf(Math.random() * 1000));
        }
        long finish = System.currentTimeMillis();
        System.out.println("Set " + text + " test " + cnt + " " + (finish - start )+ "ms");
    }

    private static void tesStrRem(List<String> list,int cnt, String text)
    {
        long start = System.currentTimeMillis();
        for (int i = cnt - 1; i >=0; i--) {
            list.remove(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Remove " + text + " test " + cnt + " " + (finish - start )+ "ms");
    }
    public static void main(String[] args) {
        {
            List<Integer> integerList = new ArrayList<>();
            testerInt(integerList, 1000, "ArrayListInt");
        }
        {
            List<Integer> integerList = new ArrayList<>();
            testerInt(integerList, 10000, "ArrayListInt");
        }
        {
            List<String> stringList = new ArrayList<>();
            testerStr(stringList, 1000, "ArrayListStr");
        }
        {
            List<String> stringList = new ArrayList<>();
            testerStr(stringList, 10000, "ArrayListStr");
        }

        //------------

        {
            List<Integer> integerList = new LinkedList<>();
            testerInt(integerList, 1000, "LinkedListInt");
        }
        {
            List<Integer> integerList = new LinkedList<>();
            testerInt(integerList, 10000, "LinkedListInt");
        }
        {
            List<String> stringList = new LinkedList<>();
            testerStr(stringList, 1000, "LinkedListStr");
        }
        {
            List<String> stringList = new LinkedList<>();
            testerStr(stringList, 10000, "LinkedListStr");
        }


    }


}
