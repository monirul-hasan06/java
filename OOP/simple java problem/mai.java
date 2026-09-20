class Teacher{
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

public class 