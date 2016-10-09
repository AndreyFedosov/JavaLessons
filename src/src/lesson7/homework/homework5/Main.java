package lesson7.homework.homework5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Controller controller = new Controller();
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        List<Room> rooms = new ArrayList<>();

        rooms.addAll(controller.requstRooms(5500,5,null,null));
        System.out.println("---------------------------------------");
        rooms.addAll(controller.requstRooms(0,0,"Paris",null));
        System.out.println("---------------------------------------");
        rooms.addAll(controller.requstRooms(1000,0,"China",null));
        System.out.println("---------------------------------------");
        rooms.addAll(controller.requstRooms(0,0,null,"Barcelona"));
        System.out.println("---------------------------------------");

        controller.check(bookingComAPI,googleAPI);
        System.out.println("---------------------------------------");
        controller.check(bookingComAPI,tripAdvisorAPI);
        System.out.println("---------------------------------------");
        controller.check(tripAdvisorAPI,googleAPI);

    }
}
