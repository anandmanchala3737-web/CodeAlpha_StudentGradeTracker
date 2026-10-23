import java.util.ArrayList;
import java.util.Arrays;
public class GradeCalculator{

    GradeManager  GM = new GradeManager();
    Student  std = new Student();
    
    public int TotalMarks(ArrayList<Student> students,int Id){
        int sum=0;
        for(Student student :   students){
            if(student.getId()==Id){
                for(int i=0; i<student.getmarks().length; i++){
                    sum+=student.getmarks()[i];
                }
            }
        }
        return sum;
        // System.out.println(sum);
    }

    public int HighestMarks(ArrayList<Student> students,int Id){
        int high=0;
        // Array.sort()
        for(Student student : students){
            if(student.getId()==Id){
                Arrays.sort(student.getmarks());
                System.out.println(student.getmarks()[4]);
            }
        }
        return high;
    }

    public int LowestMarks(ArrayList<Student> students,int Id){
        int low=0;
        // Array.sort()
        for(Student student : students){
            if(student.getId()==Id){
                Arrays.sort(student.getmarks());
                System.out.println(student.getmarks()[0]);
            }
        }
        return low;
    }

    public double AvgMarks(ArrayList<Student> students,int Id){
        int sum=0;
        for(Student student :   students){
            if(student.getId()==Id){
                for(int i=0; i<student.getmarks().length; i++){
                    sum+=student.getmarks()[i];
                }
            }
        }
        return (sum/5);
    }
}