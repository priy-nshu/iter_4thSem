package CSW_2;

import java.util.*;

public class vector1 {
    public static void main(String arg[]) {
        // Create vector
        Vector<String> vec = new Vector<String>();

        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        System.out.println("Size is: " +vec.size());
        System.out.println("Default capacity is: "+vec.capacity());

        // Adding elements using addElement() method of List
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        System.out.println("Elements are: " +vec);
        System.out.println("Size after addition: "+vec.size());

        // other Stuff

        int s = vec.capacity();
        System.out.println("Elements are: " + vec);
        if(vec.contains("Tiger")) {
            System.out.println("Tiger is present at the index " + vec.indexOf("Tiger"));
        } else {
            System.out.println("Tiger is not present in the list.");
        }
        System.out.println("The first animal of the vector is " + vec.firstElement());
        System.out.println("The last animal of the vector is " + vec.lastElement());

    }
}

