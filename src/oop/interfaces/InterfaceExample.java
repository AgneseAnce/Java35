package oop.interfaces;

interface Bug {
    public void bugSound();
    public void bugSize();
}
// All interface methods are abstract and don't have a body
interface Location{
    public void location();
}
// Each subclass can have several interfaces
class Ant implements Bug, Location{
    public void bugSound(){
        System.out.println("Tssss");
    }

    @Override
    public void bugSize() {
        System.out.println("Small");
    }

    public void location(){
        System.out.println("Forest");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {

        Ant ant = new Ant();
        ant.bugSize();
        ant.bugSound();

    }
}
