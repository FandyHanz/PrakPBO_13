package P5.P5.src.RelasiClass.tugas1;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private int id;
    private String name;
    private String department;
    private List<Course> courses;

    public Instructor(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.courses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}

