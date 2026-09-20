package OOP.Classes_and_Object;

class Smartphone {
    String brand;
    String model;
    int batteryLevel;

    public Smartphone(String inputBrand, String inputModel) {
        brand = inputBrand;
        model = inputModel;
        batteryLevel = 100;
    }

    public void playGames() {
        System.out.println("Playing a game on " + model);
        batteryLevel = batteryLevel - 20;
        System.out.println("Battery Level: " + batteryLevel);
    }
}
    public class SmartphoneTester{
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("realme", "7");
        Smartphone phone2 = new Smartphone("Nokia", "c18");

        phone1.playGames();
        phone2.playGames();
    }
}