package oop.abstraction;

public class Fish extends Pet{

    private int waterChangesInWeek;

    // Super keyword allows re-using the custom constructor from the Pet class
    public Fish (String color, String eat, String place, int averageAge, int waterChangesInWeek){
        super(color, eat, place, averageAge);
        this.waterChangesInWeek = waterChangesInWeek;
    }



    public void printPetInfo(){
        System.out.println("Color: " + color);
        System.out.println("Eats: " + eat);
        System.out.println("Habitat: " + place);
        System.out.println("Lifespan: " + averageAge);
        System.out.println("Water changes in a week: " + waterChangesInWeek);
    }
}
