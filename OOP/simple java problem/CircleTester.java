public class CircleTester {
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.radius = 7.0;
        System.out.println("Area: " +(3.1416 * c1.radius*c1.radius));
        System.out.println("circumference: "+(2*3.1416*c1.radius));
    }
}

/*Write a Java program using two classes named `Circle` and `CircleTester`. The `Circle` class should contain a single `double` field called `radius`. Inside the `CircleTester` class, write a `main` method that creates an instance of `Circle`, assigns a value of `7.0` to its radius, and then calculates and prints its area (using `pi * radius * radius`, where you can use `3.1416` or `Math.PI` for pi) and its circumference (using `2 * pi * radius`). */