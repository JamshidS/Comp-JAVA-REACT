import java.util.ArrayList;

public class StudentManager {

  private   UserManager userManager = new UserManager();



    public void addStudent(Student student){
        userManager.add(student);

    }
    public void login(String user, String pass) throws Exception {
        userManager.login(user,pass);
    }

    public void addCourse(String data){

      userManager.addCourseForStudent(data);

    }
}
