package com.xworkz.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListExecutor {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Rohit Sharma");
        list.add("shubman Gill");
        list.add("Virat Kohli");
        list.add("Shreyas Iyer");
        list.add("K L Rahul");
        list.add("Surya");
        list.add("Jadeja");
        list.add("Bumrah");
        list.add("Kuldeep");
        list.add("Shami");
        list.add("Siraj");
        System.out.println(list);
        System.out.println("The size of a list is "+list.size());
        list.add(6,"Hardik");
        System.out.println("List after Hardik got added");
        System.out.println(list);
        System.out.println(list.size());
        list.add(null);
        list.add(null);
        System.out.println(list);

    }

}
