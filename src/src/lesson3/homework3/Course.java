package lesson3.homework3;

import java.util.Date;

public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(String name, Date startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public Course(int hoursDuration, String name,String teacherName) {
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
