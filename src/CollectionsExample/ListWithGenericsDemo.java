package CollectionsExample;

import java.util.*;

public class ListWithGenericsDemo {
 
    public static void main(String[] args) {
 
        List<String> list = new ArrayList<>();
 
        list.add("Ayaan");
        list.add("Rahim");
       
 
        System.out.println("List with generics: " + list);
 
     
        String name = list.get(0);
        System.out.println("First name: " + name);
    }
}