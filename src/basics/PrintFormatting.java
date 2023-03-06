package basics;

public class PrintFormatting {
    public static void main(String[] args) {
        /*
        s - String
        d - integer
        f - float/double
        c - char
        b - boolean
         */


        // Print on next line:        System.out.println();
        // Print on the same line:         System.out.print();
        // Print formatting:        System.out.printf();

        String name = "Bob";
        int age = 34;
        double height = 192.23654d;

        // Print out string and integer
        System.out.println("Hello, " + name + ", your age is " + age);
        System.out.printf("Hello, %s, your age is %d\n", name, age);

        // Print out float/double
        System.out.printf("%s is %f cm tall\n", name, height);

        // To truncate decimal places, 2 in this case
        System.out.printf("%s is %.2f cm tall\n", name, height);

        // Hello, Bob, your age is 34 and your height is 192,24 cm... Good job, Bob!
        // Method to avoid repeating one and the same variable:
        System.out.printf("Hello, %1$s, your age is %2$d and your height is %3$.2f. Good job, %1$s", name, age, height);

    }
}
