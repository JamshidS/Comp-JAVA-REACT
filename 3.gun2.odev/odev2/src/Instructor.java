import java.util.ArrayList;

public class Instructor extends User{

    private String course;
    public Instructor(String name,String dob,String userName,String password){
        this.setFullName(name);
        this.setDataOfBirth(dob);
        this.setUserName(userName);
        this.setPassword(password);
    }

    public Instructor(String name,String dob,String userName,String password,String course){
        this.setFullName(name);
        this.setDataOfBirth(dob);
        this.setUserName(userName);
        this.setPassword(password);
        this.setCourse(course);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
