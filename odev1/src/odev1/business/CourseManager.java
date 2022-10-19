package odev1.business;

import odev1.entities.Course;

import java.util.ArrayList;

public class CourseManager {
    private Course course;
    public CourseManager(Course course){
        this.course=course;
    }
    ArrayList<String>  courses = new ArrayList<>();
    public void add(Course course){
        isCourseValid(course.getCourseName());
        System.out.println("Course added: "+ course.getCourseName());
    }

    private void isCourseValid(String courseName) {
        courses.add(courseName);
    }
}
