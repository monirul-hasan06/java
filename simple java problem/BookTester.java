/*Write a Java program using two classes named Book and BookTester. The Book class should contain two fields: a String field called title and a double field called price. Inside the BookTester class, write a main method that creates an instance of Book, assigns a title of "Java Programming" and a price of 45.50 to it, and then prints both values.*/

class Book {
    public String name;
    public double price;
}

public class BookTester {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.name = "Java Programming";
        b1.price = 45.50;
        System.out.println("Book name: " + b1.name);
        System.out.println("Books Price: " + b1.price);
    }
}