package model;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends Research {

    private List<Course> courses;

    public Lecturer(int socialSecurityNumber, String name, String email) {
        super(socialSecurityNumber, name, email);
        this.courses = new ArrayList<>();
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "Courses=" + courses +
                '}';
    }
}