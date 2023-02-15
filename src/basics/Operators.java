package basics;

public class Operators {
    public static void main(String[] args) {
        //Basic arithmetic operators -, +, *, /, %
        int x = 100;
        x = x % 76;
        System.out.println(x);

        //Assignment operators =, -=, +=, *=, /=
        int a = 10;
        a = 20;     //20
        a += 20;     // 30
        a -= 20;    // -10
        a *= 20;    //200
        System.out.println(a);
        a += 20;

        // Incrementation and decrementation operators ++, --
        int i = 10;
        i++;
        ++i;
        System.out.println(i);

        //Post-incrementation
        int num1 =  10;
        System.out.println(num1++);     //11

        //Pre-incrementation
        int num2 = 10;
        System.out.println(++num2);     //10
        System.out.println(num2);

        //4 ways to increment by one

        //RELATIONAL OPERATORS

        //Equality ==
        int p = 10;
        int k = 10;
        System.out.println(p==k);
        System.out.println("Equality " + (p==k));

        //Inequality !=
        System.out.println("Inequality " + (p!=k));

        //Greater than > and greater than or equal to >=
        System.out.println("Greater than " + (p>k));
        System.out.println("Greater than or equal to " + (p>=k));

        //Less than < and less than or equal to <=
        System.out.println("Less than " + (p<k));
        System.out.println("Less than or equal to " + (p<=k));

        //LOGICAL OPERATORS
        //Logical AND - &&

        boolean sun = false;
        boolean dry = false;

        System.out.println("I will go outside " + (sun && dry));
        System.out.println((p>k) && (p==k));

        int bobsAge = 8;
        int johnsAge = 9;
        int annasAge = 10;
        //Is John older than Bob and younger than Anna?
        System.out.println("Is John older than Bob and younger than Anna? " + ((johnsAge > bobsAge) && (johnsAge < annasAge)));

        // Logical OR ||

        boolean sale = false;
        boolean rich = false;

        System.out.println("I will be the latest IPhone " + (sale || rich));

        //Negation
        boolean example =  true;
        System.out.println("Example " + (!example));


    }
}
