package P5.P5.src.RelasiClass.tugas1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String name;
    private int credits;
    private Instructor instructor;
    private List<Student> students;

    public Course(int id, String name, int credits, Instructor instructor) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.instructor = instructor;
        this.students = new ArrayList<>();
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

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
