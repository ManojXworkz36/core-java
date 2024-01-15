package com.xworkz.collection;


import java.util.ArrayList;
import java.util.Collection;

public class CollectionExecutor {
    public static void main(String[] args) {
        Collection collection1 = new ArrayList();
        collection1.add("manu");
        collection1.add(1);

        Collection collection = new ArrayList();
      //  Application application = new Application();
       // application.setappName("Dream11");
       // collection.add(application);
        collection.add(1);
        collection.add("Biryani");

        collection.add("Manoj");
        System.out.println(collection);
        for (Object e:collection
             ) {
            System.out.println(e.toString());

        }
       // collection.forEach(System.out::println);     java 8 features
        System.out.println(collection.size());
        collection.addAll(collection1);
        System.out.println(collection.size());
        System.out.println(collection1.size());
        System.out.println(collection.contains("Manoj"));
        System.out.println(collection1.contains("manoj"));
        System.out.println(collection.containsAll(collection1));
       // collection.clear();
       // collection.removeAll(collection);
        System.out.println(collection.size());
      //  collection.toArray();
    }
}
