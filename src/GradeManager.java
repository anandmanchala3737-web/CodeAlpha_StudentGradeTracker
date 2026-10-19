import java.util.ArrayList;
import java.util.Arrays;

public class GradeManager{
    // Student std = new Student();
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(int Id, String name, int[] marks){
        Student student = new Student(Id, name, marks);
        students.add(student);
    }

    public void SearchStudent(int Id){
        for(Student student : students){
            if(student.getId()==Id){
                System.out.println("Student Id:" +student.getId());
                System.out.println("Student Name:" +student.getname());
                System.out.println("Student marks:" +Arrays.toString(student.getmarks()));
            }
        }
    }
}