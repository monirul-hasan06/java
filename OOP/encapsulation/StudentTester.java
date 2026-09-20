class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int newGrade) {
        if (newGrade >= 1 && newGrade <= 100) {
            grade = newGrade;
        } else {
            System.out.println("Invalid grade!");
        }
    }
}

public class StudentTester {
    public static void main(String[] args) {
        Student student1 = new Student("Mithu", 150);

        System.out.println("Grade: " + student1.getGrade());

        student1.setGrade(95);

        System.out.println("Grade: " + student1.getGrade());
    }
}

/*
Let's build a secure system for a school grading application.


*/