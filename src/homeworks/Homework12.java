package homeworks;
import java.util.Scanner;
public class Homework12 {
    public static void main(String[] args) {
        // Create a Java program that tells if a word is a palindrome (read identically from both sides)
        // Must be non-case-sensitive, allow for spaces etc.
        // Input data type is String

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        // Replace all used to replace all spaces in between
        String input = scanner.nextLine().trim().toLowerCase().replaceAll(" ", "");

        int length = input.length()-1;
        boolean isPalindrome = true;

        for(int i=0; i< length; i++, length--) {
            if (input.charAt(i) != input.charAt(length)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.printf("%s is a palindrome", input);
        } else {
            System.out.println("It is not a palindrome");
        }

//        Solution 2
//        boolean isPalindrome = true;
//        for (int i = 0; i < input.length() / 2; i++){
//            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
//                isPalindrome = false;
//                break;
//            }
//        }
//
//        if(isPalindrome){
//            System.out.printf("Your input %sa is a palindrome \n", input);
//        } else {
//            System.out.printf("Your input %s is not a palindrome \n", input);
//        }



//           Solution 3
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter a word");
//            String input = scanner.nextLine().trim();
//            String reverse = "";
//
//            for (int i = input.length()-1; i >=0; i--){
//                reverse = reverse + input.charAt(i);
//            }
//
//            if(input.equalsIgnoreCase(reverse)){
//                System.out.println(input +" is a palindrome");
//            } else {
//                System.out.println("It is not a palindrome");


    }
}
