package P5.P5.src.RelasiClass.tugas1;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> students;
    private List<Course> courses;
    private List<Instructor> instructors;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.instructors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void addInstructor(Instructor instructor) {
        this.instructors.add(instructor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }
}

