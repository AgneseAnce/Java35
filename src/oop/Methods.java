package oop;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userName = scanner.nextLine();

        System.out.println("Please enter your age");
        int userAge = scanner.nextInt();

        printName(userName, userAge);            // Input parameters
        String answer2 = greetings(userName);
        System.out.println(answer2);

        System.out.println(sum(4,5,6));
//        printName("Bob");
//        printName("Lisa");
    }
    // name = userName
    // age = usersAge
    // A method that does not return any value
    public static void printName(String name, int age){                  // Input arguments
        System.out.print("Hello, your name is " + name + ". ");
        System.out.println("You are " + age + " years old.");
    }

    // A method that returns a value
    public static String greetings(String name){
        String result = "Hi, " + name;
        return result;
    }

    public static int sum (int num1, int num2, int num3){
        return num1+num2+num3;
    }


}
