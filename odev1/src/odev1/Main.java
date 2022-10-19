package odev1;

import odev1.business.CourseManager;
import odev1.business.InstructorManager;
import odev1.entities.Course;
import odev1.entities.EduSite;
import odev1.entities.Instructor;

public class Main {
    public static void main(String[] args) {



        Course course1 = new Course(1,"JAVA",200);
        CourseManager courseManager = new CourseManager(course1);
        courseManager.add(course1);
        Instructor instructor =  new Instructor("Engin Demirog");
        InstructorManager instructorManager = new InstructorManager(instructor);
        instructorManager.add(instructor);
    }

}
