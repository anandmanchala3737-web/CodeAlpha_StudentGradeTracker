
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GradeManager GM =new GradeManager();
        Scanner sc = new Scanner(System.in);
        boolean con = true;
        while(con){
        int choice;
        System.out.println("--------Student Grade Managment System--------");
        System.out.println("1.Add Student");
        System.out.println("2.View All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Marks");
        System.out.println("5. Delete Studen");
        System.out.println("6. View Grade Report");
        System.out.println("7. Exit");
        choice = sc.nextInt();
             switch (choice) {
            case 1 ->{
                int id=sc.nextInt();
                String name=sc.next();
                int[] marks= new int[5];
                // marks=sc.nextInt();
                for(int i=0; i<5; i++){
                    marks[i]=sc.nextInt();
                }
                GM.addStudent(id,name,marks);
                System.out.println("student is added.");
                break;
            }
            case 2 ->{
                // ViewAllStudents();

            }
            case 3 -> {
                int Id=sc.nextInt();
                GM.SearchStudent(Id);
            }
            case 4 ->{
                // UpdateMarks(Id);
            }
            case 5 ->{
                // DeleteStudent(Id);
            }
            case 6 ->{
                // ViewGradeReport();
            }
            case 7->{
                con = false;
                break;
            }
            default -> System.out.println("Choose between 1-7");

        }
        }
        sc.close();
    }
}
