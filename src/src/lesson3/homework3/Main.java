package lesson3.homework3;
/*
You need to create following structure of the classes.

Class Course with fields: Date startDate, String name, int hoursDuration, String teacherName.
Create two constructors with fields startDate, name; and hourseDuration, name, teacherName.

Class Student with fields: String firstName, String lastName, int group, Course[] coursesTaken, int age.
With 2 constructors firstName, lastName, group; and lastName, coursesTaken.

CollegeStudent that is a child of Student. With additional fields: String collegeName, int rating, long id.
Create three constructors: two the same as in Student and one with all the fields of the class.

Class SpecialStudent that is child of CollegeStudent. With additional fields long secretKey, String email.
Create three constructors: two the same as in CollegeStudend and one with secretKey field.

Create getters and setters for all fields and make fields private as OOP principle follows.
Create 5 objects Course class. Create objects of others classes using every constructor. You must have 13 objects in Solution class.
 */

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Java Go IT", new Date());
        Course course2 = new Course("C++ for beginners", new Date());
        Course course3 = new Course("How to free Scotland", new Date());
        Course course4 = new Course(24,"Bruce Willis");
        Course course5 = new Course(36,"William Wallace");

        Course[] courses1 = {course1,course2,course3};
        Course[] courses2 = {course4,course5};

        CollegeStudent collegeStudent1 = new CollegeStudent("James","Bond",50);
        CollegeStudent collegeStudent2 = new CollegeStudent("Deadpool",courses1);
        CollegeStudent collegeStudent3 = new CollegeStudent("Arnold ","Schwarzenegger ",1,"Der Colledge",80,61231524);

        SpecialStudent specialStudent1 = new SpecialStudent("SpongeBob ","SquarePants",5);
        SpecialStudent specialStudent2 = new SpecialStudent("Rajesh", "Koothrappali",3,"California Berkle", 100, 42425425);
        SpecialStudent specialStudent3 = new SpecialStudent("Walter","White",4,237635325);

        Student student1 = new Student("Doctor","House",2);
        Student student2 = new Student("Joker",courses2);





    }
}
