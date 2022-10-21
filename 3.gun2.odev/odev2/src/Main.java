import java.lang.instrument.Instrumentation;

public class Main {
    public static void main(String[] args) throws Exception {

        Student student = new Student("Jon","2000","jon145","o126","java");
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student);
        studentManager.login("jon145","o126");
        studentManager.addCourse(student.getCourse());
        studentManager.addCourse(student.getCourse());
        Instructor instructor = new Instructor("Engin Demirog","1985","engin123","456en");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.login("engin123","456en");
        instructorManager.creatingCourse(instructor.getCourse());

    }
}