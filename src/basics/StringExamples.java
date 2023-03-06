package basics;
import java.util.Scanner;
public class StringExamples {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = scanner.nextLine();*/
        // String name = scanner.nextLine().toUpperCase();  - all letters are converted to upper case
        // String name = scanner.nextLine().toLowerCase();  - all letters are converted to lower case
        // String name = scanner.nextLine().trim();   - removes/ignores redundant leading/trailing spaces

        // name == "Bob"
        // name.equalsIgnoreCase() - not case-sensitive

       /* if (name.equals("Bob")) {
            System.out.println("Your name is Bob");
        } else {
            System.out.println("Your name is not Bob");
        }*/

        // Combine string values
        String text1 = "This is ";
        String text2 = "new text";

        // System.out.println(text1+text2); - possible but not the best method
        //  A better method is with embedded concatenation function concat()
        String result = text1.concat(text2);
        System.out.println(result);

        // Number of characters including spaces
        System.out.println("In this sentence there are " + result.length() + " characters");

        // Index of - beginning of a position for a sub-string that stands for combination of characters; single words; characters
        System.out.println(result.indexOf("is"));
        System.out.println(result.indexOf(" is "));
        System.out.println('x');

        // charAt() - prints out characters with a specific index
        System.out.println(result.charAt(0));
        System.out.println(result.charAt(1));
        System.out.println(result.charAt(2));
        System.out.println(result.charAt(3));

        // Replace
        String greetings = "This is holiday time. \nHave a nice holiday.";
        System.out.println(greetings.replaceAll("holiday", "Easter"));
        System.out.println(greetings.replaceFirst("holiday", "Easter"));
        // Replace the second instance in this case
        System.out.println(greetings.replaceAll("nice holiday", "nice Easter"));

    }
}
