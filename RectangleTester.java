public class RectangleTester {
    public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle r1 = new Rectangle();
        
        // Assign values to its fields
        r1.length = 5.5;
        r1.width = 3.0;
        
        // Print results using the object's properties
        System.out.println("Length: " + r1.length);
        System.out.println("Width: " + r1.width);
        System.out.println("Area: " + (r1.length * r1.width));
        System.out.println("Perimeter: " + (2 * (r1.length + r1.width)));
    }
}