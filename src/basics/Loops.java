package basics;

public class Loops {
    public static void main(String[] args) {
// Print out "Hello World" 10 times

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, World!");
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("Hello, World!");
        }
        System.out.println();

        // Print out number from 1 to 20
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Print out even numbers from 1 to 20
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        // Print out odd numbers from 1 to 20
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        // WHILE loop
        int i = 100;
        while (i<=10){
            System.out.println("This is WHILE loop " + i);
            i++;
        }

        // DO WHILE loop
        i = 1;
        do {
            System.out.println("This is DO WHILE loop " +i);
            i++;
        } while (i<=10);
    }
}
