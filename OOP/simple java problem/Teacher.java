class Teacher {
    String name;
    String department;
    
    public Teacher(String name, String department){
        this.name = name;
        this.department = department;
    }
    
    public void displayInformation(){
        System.out.println("Name of Teacher: " + name);
        System.out.println("Department: "+ department);
    }
}

public class Main { 
    public static void main(String[] args){ 
        Teacher teacher1 = new Teacher("Rohim", "CSE");
        Teacher teacher2 = new Teacher("Korim", "EEE");
        
        teacher1.displayInformation();
        System.out.println("-----------------");
        teacher2.displayInformation();
    }
}