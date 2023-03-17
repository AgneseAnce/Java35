package tasks;

import java.util.Scanner;

public class LeapYearInMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any year");
        int year = scanner.nextInt();

        determineLeapYear(year);
        System.out.println(determineLeapYearString(year));
    }

    public static void determineLeapYear(int year){

        if(year<0){
            System.out.println("Invalid input");
        } else if (year > 2100) {
            System.out.println("You are looking too far in the future, live for today");
        } else if (year%400 ==0 || (year%4 ==0 && year%100 !=0)){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
    public static String determineLeapYearString(int year){
        String answer;
        if (year%400 ==0 || (year%4 ==0 && year%100 !=0)){
            answer = year + " is a leap year";           // Option: return "Leap year";
        } else {
            answer = year + " is not a leap year";     // Option: return "Not a leap year";
        }
        return answer;
    }
  }
