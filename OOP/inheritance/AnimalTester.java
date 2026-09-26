class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println("Food : " + name);
    }
}
    class Cat extends Animal {
    
    // The constructor for the Cat class
    public Cat(String name) {
        // This passes the "name" up to the Animal class so it can be saved there
        super(name); 
    }

    // This is the unique method that only the Cat has
    public void meow() {
        System.out.println("Meow!");
    }

}

public class AnimalTester{
    public static void main(String[] args){
        Cat cat1 = new Cat("piku");
        cat1.eat();
        cat1.meow();
    }
}

/**
 * The Task:

Create a parent class named Animal.

Give Animal a property name (String) and a constructor that sets it.

Give Animal a method eat() that prints " [name] is eating food."

Create a child class named Cat that extends Animal.

Create a constructor for Cat that takes a name and uses super(name) to pass it up to the parent.

Give the Cat its own unique method called meow() that prints "Meow!"

In your main method, create a Cat object, and have it call BOTH eat() and meow().
 */