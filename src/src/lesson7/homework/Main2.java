package lesson7.homework;


import java.util.*;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1,"David","Duchovny","NewYork",52000));
        users.add(new User(2,"Max","Payne","New Jersey",55600));
        users.add(new User(3,"Walter","White","Albuquerque",5000000));
        users.add(new User(4,"Obi-Wan","Kenobi","Stewjon",50200));
        users.add(new User(5,"Frank","Sinatra","NewYork",20400));
        users.add(new User(6,"Fraddie","Mercury","London",34142));
        users.add(new User(7,"Edward","Teach","Kuba",15240));
        users.add(new User(8,"Gillian","Anderson","Hollywood",65000));
        users.add(new User(9,"Elon","Petrov","California",524257));
        users.add(new User(10,"Sergey","Brin","LosAltos",1000000));

        Set<Order> orders = new TreeSet<>();
        orders.add(new Order(1,500,Currency.USD,"Beer","BeerPoint",users.get(0)));
        orders.add(new Order(2,5500,Currency.UAH,"Colt","Guns",users.get(1)));
        orders.add(new Order(3,76000,Currency.EUR,"Acid","ChemistryShop",users.get(2)));
        orders.add(new Order(4,5500,Currency.USD,"LightSword","GjabahatStore",users.get(3)));
        orders.add(new Order(5,6800,Currency.EUR,"Beer","AlchoBar",users.get(4)));
        orders.add(new Order(6,9760,Currency.EUR,"PlatinumCD","MusicShop",users.get(5)));
        orders.add(new Order(7,500,Currency.USD,"Beer","BeerPoint",users.get(0)));
        orders.add(new Order(8,15000,Currency.EUR,"SecretMaterials","UFOStore",users.get(7)));
        orders.add(new Order(9,55600,Currency.USD,"Tesla","CarShop",users.get(8)));
        orders.add(new Order(10,76500,Currency.USD,"GoogleShop","GoogleShop",users.get(9)));

        System.out.println(orders);

        Iterator<Order> chechName = orders.iterator();
        while (chechName.hasNext()){
            Order order = chechName.next();
            if (order.getUser().getLastName().equals("Petrov")) {
                System.out.println("set contain order with lastname Petrov: " + order.toString());
            }
        }

        Iterator<Order> findMaxPrice = orders.iterator();
        int maxPrice = 0;

        while (findMaxPrice.hasNext()){
            Order order = findMaxPrice.next();
            if (order.getPrice() > maxPrice) maxPrice = order.getPrice();
        }
        System.out.println("Max price is " + maxPrice);



        Iterator<Order> deleteUSD = orders.iterator();
        while (deleteUSD.hasNext()){
            Order order = deleteUSD.next();
            if (order.getCurrency() == Currency.USD) deleteUSD.remove();
        }
        System.out.println(orders);




    }
}
