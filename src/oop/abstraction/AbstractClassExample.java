package oop.abstraction;

// Abstract class
abstract class Animal{
    protected String name;
    // Regular method
    public void sleep(){
        System.out.println("ZZzzzzZZZ");
    }
    // Abstract method, no body, serves just as a template
    public abstract void animalSound();
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("Oink oink");
    }

}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Cannot directly create objects from abstract class
//        Animal animal1 = new Animal();
        Pig pig = new Pig();
        pig.sleep();
        pig.animalSound();



    }
}
