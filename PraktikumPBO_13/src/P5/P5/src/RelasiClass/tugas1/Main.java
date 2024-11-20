package P5.P5.src.RelasiClass.tugas1;

public class Main {
    public static void main(String[] args) {
        University university = new University("University of Java");
        Instructor instructor1 = new Instructor(1, "John Doe", "Computer Science");
        Instructor instructor2 = new Instructor(2, "Jane Doe", "Mathematics");
        Course course1 = new Course(1, "Introduction to Java", 3, instructor1);
        Course course2 = new Course(2, "Data Structures", 4, instructor1);
        Course course3 = new Course(3, "Calculus", 4, instructor2);
        Student student1 = new Student(1, "Alice", "Computer Science");
        Student student2 = new Student(2, "Bob", "Mathematics");

        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course3);

        university.addInstructor(instructor1);
        university.addInstructor(instructor2);
        university.addCourse(course1);
        university.addCourse(course2);
        university.addCourse(course3);
        university.addStudent(student1);
        university.addStudent(student2);

        System.out.println("University Name: " + university.getName());
        System.out.println("Instructors:");
        for (Instructor instructor : university.getInstructors()) {
            System.out.println("  - " + instructor.getName() + " (" + instructor.getDepartment() + ")");
        }
        System.out.println("Courses:");
        for (Course course : university.getCourses()) {
            System.out.println("  - " + course.getName() + " (" + course.getCredits() + " credits)");
        }
        System.out.println("Students:");
        for (Student student : university.getStudents()) {
            System.out.println("  - " + student.getName() + " (" + student.getMajor() + ")");
            System.out.println("    - Enrolled in:");
            for (Course course : student.getCourses()) {
                System.out.println("      - " + course.getName());
            }
        }
    }
}
