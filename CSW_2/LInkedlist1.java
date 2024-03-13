package CSW_2;
import java.util.*;
public class LInkedlist1 {
    public static void main(String args[]) {
            LinkedList<String> al = new LinkedList<String>();
            al.add("Ravi");
            al.add("Vijay");
            al.add("Ravi");
            al.add("Ajay");

            Iterator<String> itr = al.iterator();
            while(itr.hasNext()) {
                System.out.println(itr.next());
            }

        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("Initial list of elements: " + ll);
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        System.out.println("After invoking add method: " + ll);

        ll.add(1, "Gaurav");
        System.out.println("After invoking add(index, e) method: " + ll);

        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("Sonoo");
        ll2.add("Hanumat");

        ll.addAll(ll2);
        System.out.println("After invoking addAll() method: " + ll);

                  // different code

        LinkedList<String> l1 = new LinkedList<String>();
        l1.addAll(ll2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: " + l1);

        LinkedList<String> l13 = new LinkedList<String>();
        l13.add("John");
        l13.add("Rahul");

        l1.addAll(1, l13);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + l1);

        l1.addFirst("Lokesh");
        System.out.println("After invoking addFirst(E e) method: " + l1);

        l1.addLast("Harsh");
        System.out.println("After invoking addLast(E e) method: " + l1);
        }
    }
