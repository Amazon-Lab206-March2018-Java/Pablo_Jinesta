import java.util.*;

// Your new PM knows you don't know Java too well. 
// She wants you to familiarize yourself with generics and exceptions and figure out exactly how they work. 
// First, she wants you to make an ArrayList with both numbers and strings in it.

// Tasks:
// Create ArrayList
// Try to cast each element to an Integer
// Use try/catch blocks to handle the exceptions
// Remove try/catch blocks and use generics to prevent compilation

public class ExcepGenLists {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for (Object value : myList) {
            try {
                Integer castedValue = (Integer) value;
                System.out.println(castedValue);
            } catch (Exception e) {
                System.out.println("ERROR ON INDEX {#} " + myList.indexOf(value));
            }
        }
    }
}

// Compile:
// javac ExcepGenLists.java
// java ExcepGenLists
// git push origin2 master