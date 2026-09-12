public class rectangel_calculator {
    public static void main(String[] args){
        double length = 5.5;
        double width = 3.0;
        System.out.println("length: "+length);
        System.out.println("Width: "+width);
        System.out.println("Area: "+length*width);
        System.out.println("Perimeter: "+2*(length+width));


    }
}


/*
Problem: Simple Rectangle Calculato Write a Java program using two classes: Rectangle and Tester.The Rectangle class should have:Two double fields: length and width.The Tester class should have a main method that:Creates an instance of Rectangle.Assigns values to its length (e.g., 5.5) and width (e.g., 3.0).Calculates the area ($length \times width$) and prints it.Calculates the perimeter ($2 \times (length + width)$) and prints it.

Length: 5.5
Width: 3.0
Area: 16.5
Perimeter: 17.0 */