package odev1.entities;

public class Course extends EduSite {

    public Course(int courseID,String courseName,double coursePrice){
        this.courseID=courseID;
        this.coursePrice=coursePrice;
        this.courseName=courseName;
    }
    private String courseName;
    private int courseID;
    private double coursePrice;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(short courseID) {
        this.courseID = courseID;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}
