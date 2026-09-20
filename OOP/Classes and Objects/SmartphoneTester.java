class Smartphone{
    String brand;
    String model;
    int batteryLevel;

    public Smartphone(String inputBrand, String inputModel){
        brand = inputBrand;
        model = inputModel;
        batteryLevel = 100;
        }
    public void playGames(){
        System.out.println("Playing a game on " + model);
        batteryLevel = (batteryLevel - 20);
        System.out.println("Battey Level : " + batteryLevel);
    }
}

public class SmartphoneTester{
    public static void main(String[] args){
        Smartphone phone1 = new Smartphone("realme", "7");
        Smartphone phone2 = new Smartphone("Nokia", "c18");
        phone1.playGames();
        phone2.playGames();

    }
    
}


/*
Your Challenge #2
Let's build something new to practice constructors.

The Task:

Create a class named Smartphone.

Give it three properties: brand (String), model (String), and batteryLevel (int).

Create a constructor that requires you to pass in the brand and model. Inside the constructor, set those properties, but explicitly set the batteryLevel to 100 (every new phone comes fully charged!).

Create a method playGame() that prints "Playing a game on [model]" and subtracts 20 from the batteryLevel.

In your Main class (don't forget String[] args!), create a Smartphone object, call playGame(), and then print out the remaining battery level.
*/