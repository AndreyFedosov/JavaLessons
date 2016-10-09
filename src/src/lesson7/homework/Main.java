package lesson7.homework;

import java.awt.*;
import java.util.*;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "David", "Duchovny", "NewYork", 52000));
        users.add(new User(2, "Max", "Payne", "New Jersey", 55600));
        users.add(new User(3, "Walter", "White", "Albuquerque", 5000000));
        users.add(new User(4, "Obi-Wan", "Kenobi", "Stewjon", 50200));
        users.add(new User(5, "Frank", "Sinatra", "NewYork", 20400));
        users.add(new User(6, "Fraddie", "Mercury", "London", 34142));
        users.add(new User(7, "Edward", "Teach", "Kuba", 15240));
        users.add(new User(8, "Gillian", "Anderson", "Hollywood", 65000));
        users.add(new User(9, "Elon", "Musk", "California", 524257));
        users.add(new User(10, "Sergey", "Brin", "LosAltos", 1000000));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 500, Currency.USD, "Beer", "BeerPoint", users.get(0)));
        orders.add(new Order(2, 5500, Currency.UAH, "Colt", "Guns", users.get(1)));
        orders.add(new Order(3, 76000, Currency.EUR, "Acid", "ChemistryShop", users.get(2)));
        orders.add(new Order(4, 5500, Currency.USD, "LightSword", "GjabahatStore", users.get(3)));
        orders.add(new Order(5, 6800, Currency.EUR, "Beer", "AlchoBar", users.get(4)));
        orders.add(new Order(6, 9760, Currency.EUR, "PlatinumCD", "MusicShop", users.get(5)));
        orders.add(new Order(7, 500, Currency.USD, "Beer", "BeerPoint", users.get(0)));
        orders.add(new Order(8, 15000, Currency.EUR, "SecretMaterials", "UFOStore", users.get(7)));
        orders.add(new Order(9, 55600, Currency.USD, "Tesla", "CarShop", users.get(8)));
        orders.add(new Order(10, 76500, Currency.USD, "GoogleShop", "GoogleShop", users.get(9)));

        Comparator<Order> sortByPriceDecrease = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        };

        orders.sort(sortByPriceDecrease);
        System.out.println(orders);

        Comparator<Order> sortByPriceIncrAndCity = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {

                int result = o1.getPrice() - o2.getPrice();
                if (o1.getPrice() - o2.getPrice() == 0) {
                    result = o2.getUser().getCity().compareTo(o1.getUser().getCity());
                }
                return result;

            }
        };

        orders.sort(sortByPriceIncrAndCity);
        System.out.println(orders);

        System.out.println("--------------------");

        Comparator<Order> sortByItemShopCity = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {

                int result = o1.getItemName().compareTo(o2.getItemName());
                if (result == 0) {
                    result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                    if (result == 0) {
                        result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    }
                }
                return result;

            }
        };

        orders.sort(sortByItemShopCity);
        System.out.println(orders);

        System.out.println("--------------------");
        System.out.println(orders);

        Set<Order> orderNoDub = new HashSet<>();
        orderNoDub.addAll(orders);
        orders.clear();
        orders.addAll(orderNoDub);
        System.out.println(orders);

        System.out.println("--------------------");

        System.out.println(users);
        Set<User> userNoDub = new HashSet<>();
        userNoDub.addAll(users);
        users.clear();
        users.addAll(userNoDub);

        System.out.println(users);
        System.out.println("--------------------");

        Iterator<Order> iteratorOrderLess = orders.iterator();
        while (iteratorOrderLess.hasNext()) {
            Order order = iteratorOrderLess.next();
         if (order.getPrice() < 1500) iteratorOrderLess.remove();
        }

        System.out.println(orders);
        System.out.println("--------------------");

        List<Order> ordersUAH = new ArrayList<>();
        List<Order> ordersUSD = new ArrayList<>();

        Iterator<Order> iteratorSeparateCurr = orders.iterator();
        while (iteratorSeparateCurr.hasNext()){
            Order order = iteratorSeparateCurr.next();
            if (order.getCurrency() == Currency.UAH) ordersUAH.add(order);
            if (order.getCurrency() == Currency.USD) ordersUSD.add(order);
        }
        System.out.println(ordersUAH);
        System.out.println(ordersUSD);
        System.out.println("--------------------");

        //--------------stupid code--------------
        Set<String> cityList = new HashSet<>();
        Iterator<Order> iteratorCity = orders.iterator();
        while (iteratorCity.hasNext()) {
            Order order = iteratorCity.next();
            cityList.add(order.getUser().getCity());
        }
        System.out.println(cityList);

            List<List<String>> cityAllList = new ArrayList<>();

        for (String city : cityList) {
            List<String> cityUserName = new ArrayList<>();

            for (User user : users)
            {
                if (user.getCity().equals(city))
                {
                    cityUserName.add(user.getFirstName()+" "+user.getLastName());
                }
            }
            cityAllList.add(cityUserName);

        }

        System.out.println(cityAllList);
    }

}
