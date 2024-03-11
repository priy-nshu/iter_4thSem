package CSW_2;

import java.util.*;

public class ArrayList1{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist

        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        System.out.println(list);//Printing the arraylist object

        //Traversing list through Iterator
        Iterator itr=list.iterator();//getting the Iterator

        while(itr.hasNext()){//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }

        ArrayList<String> al = new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        System.out.println("Returning element: " +al.get(1));

        // changing the element
        al.set(1, "Dates");

        // traversing list
        for(String fruit:al)
            System.out.println(fruit);
    }
}
