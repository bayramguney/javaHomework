package day18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class hashSetHomework {
    public static void main(String[] args) {

        System.out.println("8. Write a Java program to convert a hash set to a tree set.");

        HashSet<String> list1 = new HashSet<String>();
        list1.add("mars");
        list1.add("uranus");
        list1.add("moon");
        list1.add("earth");

        System.out.println("HashSet contains: " + list1);

        TreeSet<String> list2 = new TreeSet<String>(list1);

        System.out.println("TreeSet contains: ");
        for (String lst : list2) {
            System.out.print(lst + " ");
        }
        System.out.println();

        System.out.println("9. Write a Java program to convert a hash set to a List/ArrayList.");

        ArrayList<String> list3 = new ArrayList<>(list1);
        System.out.println(list3);

        System.out.println("10. Write a Java program to compare two hash set.");
        HashSet<String> list4 = new HashSet<String>();
        list4.add("asia");
        list4.add("europe");
        list4.add("america");
        if (list4.equals(list1)) {
            System.out.println("list are same");
        } else {
            System.out.println("list are not same");
        }

        System.out.println("11. Write a Java program to compare two sets and retain elements which are same on both sets");
        HashSet<String> list5 = new HashSet<String>();
        list5.add("asia");
        list5.add("pear");
        list5.add("america");
        list5.add("apple");
        list4.retainAll(list5);
        System.out.println(list4);

        System.out.println("12. Write a Java program to remove all of the elements from a hash set.");
        list4.clear();
        System.out.println(list4);

        System.out.println("13. Write a Java Program to find duplications");
        ArrayList<Integer> str1 = new ArrayList<>();

        Random rnd = new Random();
        for (int i = 1; i <= 10; i++) {
            int rand = rnd.nextInt(100);
            str1.add(rand);
        }
        System.out.println(str1);
        for (int i = 0; i <= str1.size() - 1; i++) {
            if ((str1.indexOf(i)) == (str1.indexOf(i + 1))) {
                System.out.println("dub");
                break;


            }
        }
    }
}


