package day18;

import java.util.ArrayList;
import java.util.Collections;

public class arraylisthomework {
    public static void main(String[] args) {
        System.out.println("10-     Write a Java program to shuffle elements in a array list.[advanced]");
        ArrayList<String> list1 = new ArrayList<>(50);
        list1.add("washington");
        list1.add("newyork");
        list1.add("maine");
        list1.add("los angeles");
        System.out.println(list1);
        Collections.shuffle(list1);
        System.out.println(list1);

        System.out.println(" 12   Write a Java program to extract a portion of a array list.");

        System.out.println(list1.subList(1, 4));

        System.out.println("13. Write a Java program to compare two array lists.");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("brooklyn");
        list2.add("bronx");
        list2.add("queens");
        list2.add("manhattan");
        list2.add("staten island");
        if (list1.equals(list2)) {
            System.out.println("arraylist are same");
        } else {
            System.out.println("array are not same");
        }

        System.out.println("14. Write a Java program of swap two elements in an array list.");
        Collections.swap(list1, 2, 3);
        System.out.println(list1);

        System.out.println("Write a Java program to join two array lists.");
        list1.addAll(list2);
        System.out.println(list1);

        System.out.println("16. Write a Java program to clone an array list to another array list.");
        ArrayList<String> list3 = (ArrayList<String>) list1.clone();
        System.out.println(list3);

        System.out.println("17. Write a Java program to empty an array list.");
        list3.clear();
        System.out.println(list3);

        System.out.println("18. Write a Java program to test an array list is empty or not.");
        if (list3.isEmpty()) {
            System.out.println("array is empty");
        } else {
            System.out.println("array is not empty");
        }

        System.out.println("19. Write a Java program to trim the capacity of an array list the current list size.");
        list1.trimToSize();
        System.out.println(list1);

        System.out.println("20. Write a Java program to increase the size of an array list.");
        list1.ensureCapacity(10);
        System.out.println(list1);

        System.out.println("21. Write a Java program to replace the second element of a ArrayList with the specified element.");
        list1.set(1, "arkansas");
        System.out.println(list1);

        System.out.println("22. Write a Java program to print all the elements of a ArrayList using the position of the elements.");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + "   ");
        }

    }
}
