package lesson9.homework;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by AFedosov on 23.10.2016.
 */
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


        System.out.println(orders);
        System.out.println("----- Check name -------");
        checkName(orders,"Kenobi");
        System.out.println("----- Sort decrease -------");
        sortByPrice(orders);
        System.out.println("----- Sort increse and city ------");
        sortByPriceAndCityName(orders);
        System.out.println("------Sort shop and city ------");
        sortByItemAndShopAndCity(orders);
        System.out.println("----- Delete dublicates -------");
        deleteDublicates(orders);
        System.out.println("----- Delete low price -------");
        deletePriceLow(orders);
        System.out.println("----- Separate list by currency -------");
        List<List<Order>> listOrder = separateByCurrency(orders);
        System.out.println(listOrder);
        System.out.println("----- Separate list by city -------");
        Set<List<Order>> setOrder = separateOrders(orders);
        System.out.println(setOrder);
        System.out.println("----- Delete USD's -------");
        deleteUSD(orders);







    }

    private static void sortByPrice (List<Order> orders)
    {
        Collections.sort(orders,(a,b)-> Integer.compare(b.getPrice(),a.getPrice()));
        System.out.println(orders);
    }

    private static void sortByPriceAndCityName (List<Order> orders)
    {
        Comparator<Order> sortByPrice = (a,b) -> Integer.compare(a.getPrice(),b.getPrice());
        Comparator<Order> sortByCityName = (a,b) -> a.getUser().getCity().compareTo(b.getUser().getCity());
        Collections.sort(orders,sortByPrice.thenComparing(sortByCityName));
        System.out.println(orders);
    }

    private static void sortByItemAndShopAndCity (List<Order> orders)
    {
        Comparator<Order> sortByItemName = (a,b) -> a.getItemName().compareTo(b.getItemName());
        Comparator<Order> sortByShopId= (a,b) -> a.getShopIdentificator().compareTo(b.getShopIdentificator());
        Comparator<Order> sortByCityName = (a,b) -> a.getUser().getCity().compareTo(b.getUser().getCity());
        Collections.sort(orders,sortByItemName.thenComparing(sortByShopId.thenComparing(sortByCityName)));
        System.out.println(orders);

    }

    private static void deleteDublicates (List<Order> orders)
    {

            System.out.println(orders.stream()
                .distinct()
                .collect(Collectors.toList()));
    }

    private static void deletePriceLow (List<Order> orders)
    {
        orders.stream()
                .filter(a -> a.getPrice()<1500)
                .collect(Collectors.toList())
                .forEach(orders::remove);

        System.out.println(orders);
    }

    private static void deleteUSD (List<Order> orders)
    {
        orders.stream()
                .filter(a -> a.getCurrency().equals(Currency.USD))
                .collect(Collectors.toList())
                .forEach(orders::remove);

        System.out.println(orders);
    }

    private static List<List<Order>> separateByCurrency (List<Order> orders)
    {
        List<List<Order>> orderList = new ArrayList<>();
        orderList.add(orders.stream()
                .filter(a -> a.getCurrency().equals(Currency.USD))
                .collect(Collectors.toList()));

        orderList.add(orders.stream()
                .filter(a -> a.getCurrency().equals(Currency.UAH))
                .collect(Collectors.toList()));
        return orderList;
    }

    private static Set<List<Order>> separateOrders(List<Order> orders) {

        Function<Order, List<Order>> f = new Function<Order, List<Order>>() {
            @Override
            public List<Order> apply(Order order) {
                return orders.stream()
                        .filter(o -> o.getUser().getCity().equals(order.getUser().getCity()))
                        .collect(Collectors.toList());

            }
        };

        Set<List<Order>> res =  orders.stream()
                .map(f)
                .collect(Collectors.toSet());


        return res;
    }

    private static void checkName (List<Order> orders, String name)
    {
        orders.stream()
                .filter(a -> a.getUser().getLastName().equals(name))
                .forEach(a -> System.out.println("Order" + a + " contain " + name));


    }


}
