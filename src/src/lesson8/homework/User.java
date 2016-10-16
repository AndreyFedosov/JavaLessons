package lesson8.homework;

/**
 * Created by AFedosov on 16.10.2016.
 */
public class User {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
