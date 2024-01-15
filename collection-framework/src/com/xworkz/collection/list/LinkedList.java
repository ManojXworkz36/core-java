package com.xworkz.collection.list;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List list = new java.util.LinkedList();

        list.add("David warner");
        list.add("Travis Head");
        list.add("Marsh");
        list.add("smith");
        list.add("labushchange");
        list.add("Maxwell");
        list.add("Inglis");
        list.add("Starc");
        list.add("Cummins");
        list.add("zampa");
        list.add("Hazelwood");
        System.out.println(list);
        System.out.println("The size of a list is "+list.size());
        list.add(6,"Stoinis");
        System.out.println("List after stoinis  got added");
        System.out.println(list);
        System.out.println(list.size());
        list.add(null);
        list.add(null);
        list.add("Marsh");
        System.out.println(list);
        System.out.println(list.size());



    }
}
