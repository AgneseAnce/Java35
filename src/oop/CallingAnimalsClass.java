package oop;

public class CallingAnimalsClass {
    public static void main(String[] args) {

        // Creating a new Animals class object
        Animals dog = new Animals("Dachshund", 15, 8.6d);
        dog.printAnimalsInfo();

        Animals cat = new Animals("Mainecoon",16, 9.5d);
        cat.printAnimalsInfo();

        Animals hamster = new Animals("Common hamster ", 4);
        hamster.printAnimalsInfo();

        Animals dog2 = new Animals();


    }
}
