package P5.P5.src.RelasiClass.tugas1;

import java.util.ArrayList;
import java.util.List;

public class Student {
     private int id;
    private String name;
    private String major;
    private List<Course> courses;

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        this.courses.add(course);
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}

