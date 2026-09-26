class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Gheu Gheu!");
    }


}
    class Cat extends Animal{
        public Cat(String name){
            super(name);
        }
        @Override
        public void makeSound(){
            System.out.println("Meow!");
        }
    }

    class Dog extends Animal{
        public Dog(String name){
            super(name);
        }
        @Override
        public void makeSound(){
            System.out.println("Woof!");
        }
    }

public class AnimalApp {
    public static void main(String[] args){
        Cat cat = new Cat("Piku");
        Dog dog = new Dog("Shiku");
        cat.makeSound();
        dog.makeSound();

    }
}


// /**
//  * The Task:

// Create the Parent Class (Animal):

// Give it a property String name.

// Create a constructor to set name (using this.name = name;).

// Create a method called makeSound() that prints: "Some generic animal noise..."

// Create the First Child Class (Cat):

// Ensure it extends Animal.

// Create a constructor that takes a String name and passes it up to the parent using super(name);.

// @Override the makeSound() method to print: "Meow!"

// Create the Second Child Class (Dog):

// Ensure it extends Animal.

// Create a constructor that takes a String name and passes it up to the parent using super(name);.

// @Override the makeSound() method to print: "Woof!"

// Create the Execution Class (AnimalApp):

// Make this class public.

// Add your public static void main(String[] args) method.

// Inside main, create one Cat object and one Dog object.

// Call the .makeSound() method on both of them.
//  *mnbvc x/