package lesson5.webinar;

public class Employee {
    private Integer id;
    private String firstname;
    private String lastName;
    private String department;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
