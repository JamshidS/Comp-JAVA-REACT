package odev1.business;

import odev1.entities.Course;
import odev1.entities.EduSite;
import odev1.entities.Instructor;

import java.util.ArrayList;



public class InstructorManager {
    private Instructor instructor;

    public InstructorManager(Instructor instructor){
        this.instructor=instructor;
    }
    ArrayList<String> instructors=new ArrayList<>();




    public void add(Instructor instructor){
        validator(instructor.getInstructorName());
        System.out.println("Instructor added: "+instructor.getInstructorName());
    }

    private void validator(String instructorName) {
        instructors.add(instructorName);
    }
}
