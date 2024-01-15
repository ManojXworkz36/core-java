package com.xworkz.customobject.customclasses;

import java.util.*;

public class MapExecutor {

    public static void main(String[] args) {
        Map<Integer,String>  map =new HashMap<Integer,String>();
        map.put(1,"Gagan");
        map.put(4,"sachin");
        map.put(3,"yuvi");
        map.put(2,"Eshwar");
        map.put(5,"Venki");
        map.put(7,"Amruth");
        map.put(6,"Nitish");
        map.put(8,"Sidda");
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Sidda"));
        System.out.println(map.get(1));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.remove(3));
        System.out.println(map.putIfAbsent(1,"Gagan"));
        System.out.println(map.replace(1,"Gagan","Manoj"));
        System.out.println(map);

        System.out.println(map.keySet());
        Set<Map.Entry<Integer,String>> entries= map.entrySet();
        for (Map.Entry<Integer,String> entry:entries
             ) {
            System.out.println(entry.getKey() + " =  "+ entry.getValue());

        }

    }
}
