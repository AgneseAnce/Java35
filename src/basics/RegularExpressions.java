package basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {

        // Example 1 - Pattern object / Matcher object
        Pattern patternEx = Pattern.compile("a+b");
        Matcher matcherEx = patternEx.matcher("ab");

        System.out.println(matcherEx.matches());
        System.out.println(matcherEx.find());

        // Example 2 - shorter code
        // Any 3 symbols that would be any lower case letter or number from 5 to 9
        System.out.println("Example 2: "+ Pattern.matches("[a-z5-9]{3}", "659"));

        // 2 uppercase letters followed by at least 2 lowercase letters and then by no more than 3 numbers
        System.out.println("Example 3: " + Pattern.matches("[A-Z]{2}[a-z]{2,}[0-9]{3}", "AAbb123"));

        // 2 to 7 any letters or any numbers
        System.out.println("Example 4 " + Pattern.matches("[a-zA-z0-9]{2,7}", "ki37d"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the car plate number");
        String plateNumber = scanner.nextLine();

        // 2 UPPERCASE letters followed by one "-" symbol and the 2-4 numbers
        if(Pattern.matches("[A-Z]{2}-[0-9]{2,4}", plateNumber)){
            System.out.println("Your plate number is valid");
        } else {
            System.out.println("Your plate number is not valid");
        }


    }
}
