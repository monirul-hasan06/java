class Vehicle {
    public void move() {
        System.out.println("The vehicle moves forward.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car drives on the highway.");
    }
}

class Boat extends Vehicle {
    @Override
    public void move() {
        System.out.println("The boat sails across the water.");
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Car myCar = new Car();
        Boat myBoat = new Boat();
        
        myCar.move(); 
        myBoat.move(); 
    }
}