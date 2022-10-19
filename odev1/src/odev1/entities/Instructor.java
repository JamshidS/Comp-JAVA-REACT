package odev1.entities;

public class Instructor extends EduSite{
    private String instructorName;

    public Instructor(String instructorName){
        this.instructorName=instructorName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }


}
