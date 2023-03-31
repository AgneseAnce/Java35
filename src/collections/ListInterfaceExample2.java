package collections;

import java.util.ArrayList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {

        // Example 1

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("List 1 = " + list1);

        ArrayList<Integer> list2 = new ArrayList<>(list1);
//        list2.addAll(list1);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        System.out.println("List 2 = " + list2);

        // Example 2

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test 1");
        arrayList.add("Test 2");
        arrayList.add("Test 3");

        // FOR loop
        for(int i = 0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i) + " ");
        }
        System.out.println();

        // FOR EACH loop
        for(String str: arrayList){
            System.out.println(str);
        }
    }
}
