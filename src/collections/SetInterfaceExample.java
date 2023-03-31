package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Anna");
        names.add("Panna");
        names.add("Vanna");

        System.out.println(names);

        // Remove elements
        names.remove("Vanna");

        // Size of the list
        System.out.println(names.size());

        // Contains
        System.out.println(names.contains("Panna"));
        System.out.println(names);

        // Iterate through elements
        for(String str: names){
            System.out.println(str);
        }

        // Example 2

        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println("IntSet1: " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        System.out.println("IntSet2: " + intSet2);

        // Find union (what is common in two datasets)

        HashSet<Integer> union = new HashSet<>(intSet1);
        System.out.println("Union before: " + union);
        union.addAll(intSet2);
        System.out.println("Union after: " + union);


        // Find intersection
        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("Intersection: " + intersection);

        // Find difference for intSet1
        HashSet<Integer> difference1 = new HashSet<>(intSet1);
        difference1.removeAll(intSet2);
        System.out.println("Difference intSet1: " + difference1);

        // Find difference for intSet2
        HashSet<Integer> difference2 = new HashSet<>(intSet2);
        difference2.removeAll(intSet1);
        System.out.println("Difference intSet2: " + intSet2);

        // All differences
        HashSet<Integer> diffAll = new HashSet<>(difference1);
        diffAll.addAll(difference2);
        System.out.println("All differences: " + diffAll);

        // LinkedHashSet

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Estonia");
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Finland");
        linkedHashSet.add("Ukraine");

        System.out.println(linkedHashSet);
        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);

    }
}
