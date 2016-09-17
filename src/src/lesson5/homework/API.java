package lesson5.homework;

/**
 * Created by AFedosov on 16.09.2016.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAllRooms();

}
