package CSW_2;

import java.util.*;
public class hash1{
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.putIfAbsent(5,"Guava");
        System.out.println("2nd "+map);

        map.putIfAbsent(2,"Straw");
        System.out.println("3rd "+map);

        map.put(3,"tea");
        System.out.println("4th "+map);

        HashMap<Integer, String> map1=new HashMap<Integer, String>();
        map1.put(9,"hahaha");
        map1.putAll(map);
        map.putAll(map1);
        System.out.println("Map1 "+map1);

        map.remove(1);
        map.remove(2,"Apple");
        System.out.println("5th "+map);

        map.replace(3,"Zrkr");
        System.out.println("6th "+map);
        map1.replaceAll((K,V)->"pomogrante");
        System.out.println(map1);

    }
}