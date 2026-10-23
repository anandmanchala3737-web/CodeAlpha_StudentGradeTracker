// package src;

public class Student{
    private int Id;
    private String name;
    private int[] marks= new int[5];
    Student(int Id, String name, int[] marks){
        this.Id=Id;
        this.name=name;
        this.marks=marks;
    }
    Student(){
        
    }
//Setter
    void setId(int Id){
        this.Id=Id;
    }
    void setname(String name){
        this.name=name;
    }
    void setmarks(int[] marks){
        this.marks=marks;
    }

//Getter
    int getId(){
        return this.Id;
    }
    String getname(){
        return this.name;
    }
    int[] getmarks(){
        return this.marks;
    }

}