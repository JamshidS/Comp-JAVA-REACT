import java.util.ArrayList;

public class Student extends User{


    private String course;
    public Student(){}

    public Student(String name,String dateOfBirth,String userName,String password){
        super();
        this.setFullName(name);
        this.setDataOfBirth(dateOfBirth);
        this.setUserName(userName);
        this.setPassword(password);
    }

    public Student(String name,String dateOfBirth,String userName,String password,String course){
        this.setFullName(name);
        this.setDataOfBirth(dateOfBirth);
        this.setUserName(userName);
        this.setPassword(password);
        this.setCourse(course);
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}
