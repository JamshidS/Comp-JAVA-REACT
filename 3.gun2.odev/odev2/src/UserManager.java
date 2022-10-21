import java.util.ArrayList;

public class UserManager {
  private   ArrayList<String> passwords=new ArrayList<>();
  private   ArrayList<String> userNames = new ArrayList<>();
  private   ArrayList<String> names = new ArrayList<>();
  private   ArrayList<String> dateOfBirths =  new ArrayList<>();
  private   ArrayList<String> takenCourses = new ArrayList<>();
  private   ArrayList<String> givenCourses = new ArrayList<>();


    public void add(User user){
        userNames.add(user.getUserName());
        names.add(user.getFullName());
        passwords.add(user.getPassword());
        dateOfBirths.add(user.getDataOfBirth());
        System.out.println(user.getFullName()+" added Successfully");
}
    public void login(String user,String pass) throws Exception {


        for(int i=0;i<userNames.size();i++){
        if(userNames.get(i)==user && passwords.get(i)==pass){
        System.out.println("Login Successfully");
          }else{
        throw new Exception("UserName or Password is wrong please try again");
}
}}

    public void addCourseForStudent(String data){
        boolean flag = true;
//        takenCourses.add("Basics of Programming");
        for(int i=0;i<takenCourses.size();i++){
            if(takenCourses.get(i)==data){
                System.out.println("You have already enrolled to this course");
                flag = false;

            }
            }
        if(flag==true){
            takenCourses.add(data);
            System.out.println("Enrolled Successfully: "+ data);
        }

        }
        public void addingCourseForTeacher(String data) throws Exception {

            for (int i=0;i<givenCourses.size();i++){
                if(givenCourses.get(i)==data){
                    throw new Exception("There is a course already exist with the same name!!");
                }
            }
            givenCourses.add(data);
            System.out.println(data+" course is created");
        }
    }

