package lesson5.homework;

import java.util.Arrays;

public class Controller {
    API[] api = new API[3];

    //which finds all the rooms with requested params. Method use all apis available to make search.
    //Found rooms create to DB

    private Room[] recreateArrays (Room[] rooms)
    {
        int i = 0;
        for (Room room : rooms) {
            if (room != null) i++;
        }

        Room[] finalRooms = new Room[i];
        for (int k = 0;k < i;k++ )
        {
            finalRooms[k] = rooms[k];
        }
        return finalRooms;
    }

    Room[] requstRooms(int price, int persons, String city, String hotel)
    {
        Room[] rooms = new Room[15];
        int i = 0;

     for (API api : this.api)
     {
         Room[] apirooms = recreateArrays(api.findRooms(price,persons,city,hotel));

         for (Room room : apirooms)
         {
                 save(room);
                 rooms[i] = room;
                 i++;
         }
     }

        return recreateArrays(rooms);
    }

    //Chech how many the same rooms two different apis return
    Room[] check(API api1, API api2)
    {
        Room[] firstRooms = api1.getAllRooms();
        Room[] secondRooms = api2.getAllRooms();
        Room[] foundEqualRoom = new Room[10];
        int i=0;

        for (Room firstRoom : firstRooms)
        {
            for (Room secondRoom : secondRooms) {
                if (firstRoom.equals(secondRoom) & firstRoom.getHotelName() == secondRoom.getHotelName()) {
                    foundEqualRoom[i] = firstRoom;
                    i++;
                    //sout if equals room was found
                    System.out.println(firstRoom.toString());
                }
            }
        }
        return recreateArrays(foundEqualRoom);
    }

    Room save(Room room) {
        DAO dao = new DAOImpl();
        return dao.save(room);
    }

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        this.api = new API[]{bookingComAPI,googleAPI,tripAdvisorAPI};
    }
}
