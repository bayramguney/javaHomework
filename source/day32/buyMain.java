package day32;

import java.util.ArrayList;

public class buyMain {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("milk");
        shoppingList.add("bread");
        shoppingList.add("water");
        shoppingList.add("sugar");


        buyStuff stuff = new buyStuff();
        stuff.myList(shoppingList);


    }
}