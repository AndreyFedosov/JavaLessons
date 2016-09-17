package lesson5.homework;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Controller controller = new Controller();
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        Room[] rooms = new Room[15];

        rooms = controller.requstRooms(5500,5,null,null);
        System.out.println("---------------------------------------");
        rooms = controller.requstRooms(0,0,"Paris",null);
        System.out.println("---------------------------------------");
        rooms = controller.requstRooms(1000,0,"China",null);
        System.out.println("---------------------------------------");
        rooms = controller.requstRooms(0,0,null,"Barcelona");
        System.out.println("---------------------------------------");

        rooms = controller.check(bookingComAPI,googleAPI);
        System.out.println("---------------------------------------");
        rooms = controller.check(bookingComAPI,tripAdvisorAPI);
        System.out.println("---------------------------------------");
        rooms = controller.check(tripAdvisorAPI,googleAPI);

    }
}
