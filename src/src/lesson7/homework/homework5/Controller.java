package lesson7.homework.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Controller {
    List<API> api = new ArrayList<>();

    //which finds all the rooms with requested params. Method use all apis available to make search.
    //Found rooms create to DB

    List<Room> requstRooms(int price, int persons, String city, String hotel)
    {
        List<Room> rooms = new ArrayList<>();

     for (API api : this.api)
     {
        rooms.addAll(api.findRooms(price,persons,city,hotel));


     }
        Iterator<Room> room = rooms.iterator();
        while (room.hasNext())
        {
            Room saveRoom = room.next();
            save(saveRoom);
        }

        return rooms;
    }

    //Chech how many the same rooms two different apis return
    List<Room> check(API api1, API api2)
    {
        List<Room> firstRooms = api1.getAllRooms();
        List<Room> secondRooms = api2.getAllRooms();
        List<Room> foundEqualRoom = new ArrayList<>();


        for (Room firstRoom : firstRooms)
        {
            for (Room secondRoom : secondRooms) {
                if (firstRoom.equals(secondRoom) & firstRoom.getHotelName() == secondRoom.getHotelName()) {
                    foundEqualRoom.add(firstRoom);
                    //sout if equals room was found
                    System.out.println(firstRoom.toString());
                }
            }
        }
        return foundEqualRoom;
    }

    Room save(Room room) {
        DAO dao = new DAOImpl();
        return dao.save(room);
    }

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        this.api.add(bookingComAPI);
        this.api.add(googleAPI);
        this.api.add(tripAdvisorAPI);

    }
}
