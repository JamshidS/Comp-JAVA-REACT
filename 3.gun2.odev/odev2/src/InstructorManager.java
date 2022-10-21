import javax.security.sasl.SaslServer;

public class InstructorManager {

   private UserManager userManager =  new UserManager();
    public void add(Instructor instructor){
        userManager.add(instructor);
    }
    public void login(String user,String pass) throws Exception {
        userManager.login(user,pass);
    }
    public void creatingCourse(String data) throws Exception {
      userManager.addingCourseForTeacher(data);

    }
}
