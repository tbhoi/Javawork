package OopsInheritance;

public class Myhome {

    public static void main(String[] args) {
        Home home = new Home();
        Kitchen kitchen = new Kitchen();
        Bedroom bedroom = new Bedroom();
        Livingroom livingroom = new Livingroom();
        home.noOfLight(6, "Home");
        bedroom.noOfLight(2, "Bedroom");
        kitchen.noOfLight(1, "kitchen");
        livingroom.noOfLight(3, "livingroom");

    }
}