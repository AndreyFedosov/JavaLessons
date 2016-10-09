package lesson7.homework.homework5;


import java.util.Date;

public class DAOImpl implements DAO {
    Room[] database = new Room[10];

    public DAOImpl() {

    }

    @Override
    public Room save(Room room) {
        System.out.println("ID: " + room.getId() + " Room with " + room.getPersons() + " place(s) in " + room.getHotelName() + " with price " + room.getPrice() + " has been saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("ID: " + room.getId() + " Room with " + room.getPersons() + " place(s) in " + room.getHotelName() + " with price " + room.getPrice() + " has been deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("ID: " + room.getId() + " Room with " + room.getPersons() + " place(s) in " + room.getHotelName() + " with price " + room.getPrice() + " has been updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(id,400,1,new Date(),"Noone","Kiev");
        return room;
    }
}
