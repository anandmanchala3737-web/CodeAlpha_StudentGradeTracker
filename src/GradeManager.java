import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GradeManager{
    // Student std = new Student();
    Scanner sc = new Scanner(System.in);
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
                System.out.println("Total marks:");
            }
        }
    }

    public void RemoveStudent(int Id){
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getId()==Id){
                students.remove(i);
                System.out.println("Deleted!");
                break;
            }
            else{
                System.out.println("Student is not found!");
            }
        }
    }

    public void ViewAllStudents(){
        for(Student student : students){
                System.out.println("Student Id:" +student.getId());
                System.out.println("Student Name:" +student.getname());
                System.out.println("Student marks:" +Arrays.toString(student.getmarks()));
                System.out.println("Total marks:");
                System.out.println("Highest mark:");
                System.out.println("Lowest mark:");
                System.out.println("Average marks:");
        }
    }
    
    public void UpdateMarks(int Id){
        int[] DMark={};
        Student std=null;
        for(Student student : students){
            if(student.getId()==Id){
                DMark=student.getmarks();
                std=student;
            }
            else{
                System.out.println("Student not avaliable!");
            }
        }
            System.out.println("Which subject marks want to change:");
            System.out.println("Subjet 1");
            System.out.println("Subjet 2");
            System.out.println("Subjet 3");
            System.out.println("Subjet 4");
            System.out.println("Subjet 5");
            System.out.println("Entire marks");
            int choice=sc.nextInt();
            if(choice==6){
                int[] Nmarks = new int[5];
                for(int i=0; i<5; i++){
                    Nmarks[i]=sc.nextInt();
                }
                std.setmarks(Nmarks);
            }
            else{
                int mark=sc.nextInt();
                DMark[choice-1]=mark;
                std.setmarks(DMark);
            }
    }
}