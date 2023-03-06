package homeworks;

public class Homeworks6 {
    public static void main(String[] args) {

        /* Write an application that will print the full latin alphabet
        (upper case letters) in alphabetical order. Each letter should be printed in new line.
         */

        char ch = 'A';

        for (char i = 'A'; i <= 'Z'; i++){
            System.out.println(i);
        }

        /* Solution 2
        for (int i = 65; i <=90; i++){      // 65 = A in the ASCII table, 90 = Z
         System.out.println((char) i); }
       Solution 3
       for (char abc = 65; abc <=90; abc++){
            System.out.println(abc); }
         */
    }
}
