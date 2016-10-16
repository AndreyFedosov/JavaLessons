package lesson8.temp;


import java.util.HashMap;
import java.util.*;

public class main {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("key", "value");
        map.put("key1", "value");


        System.out.println(map.keySet().size());
    }

}
