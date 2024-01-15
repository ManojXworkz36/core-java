package com.xworkz.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExecutor {
    public static void main(String[] args) {
        Set set =  new LinkedHashSet();
        set.add("Kock");
        set.add("Bavuma");
        set.add("dussen");
        set.add("markram");
        set.add("Klassen");
        set.add("Miller");
        set.add("Janesn");
        set.add("Mahraj");
        set.add("Cotezea");
        set.add("Rabada");
        set.add("shamsi");
        System.out.println(set);
        System.out.println("The size of a list is "+set.size());
        //  queue.add(6,"Stoinis");
        //System.out.println("List after stoinis  got added");
        System.out.println(set);
        System.out.println(set.size());
        set.add("shamsi");
        System.out.println(set);
        set.add(null);
        set.add(null);
        set.add("shamsi");
        System.out.println(set);
        System.out.println(set.size());


    }
}
