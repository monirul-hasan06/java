class Student {
    int id;
    String name;
    
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public void displayInformation(){
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

public class Main{
    public static void main(String [] args){
        Student student1 = new Student(1, "John Doe");
        // Fixed the typo "Stuent" here:
        Student student2 = new Student(2, "Jane Smith"); 
        
        // Added these lines so you can see the output:
        student1.displayInformation();
        System.out.println("-----------------");
        student2.displayInformation();
    }
}