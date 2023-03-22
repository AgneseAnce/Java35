package oop.inheritance;

class Parent{
    public void printParent(){
        System.out.println("This is parent class");
    }
}
class Child extends Parent{
    public void printChild(){
        System.out.println("This is child class");
    }

}
public class InheritanceIntro {
    public static void main(String[] args) {
        // Default Parent class constructor
        Parent parent = new Parent();
        // Calling Parent class object
        parent.printParent();

        Child child = new Child();
        child.printParent();
        child.printChild();

    }
}
