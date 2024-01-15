package com.xworkz.map;

import com.xworkz.map.comparator.OfficerComarator;
import com.xworkz.map.officer.Officer;

import java.util.*;

public class Executor {

    public static void main(String[] args) {

        Map<Integer, Officer> map = new HashMap<>();

        map.put(1, new Officer("Gagan", 1, "Davanagere", 22, "Psi", "A+", "male"));
        map.put(2, new Officer("Sachin", 2, "Shivmogga", 23, "cpi", "B+", "male"));
        map.put(3, new Officer("Yuvi", 3, "Vijayanagara", 25, "Dysp", "AB", "male"));
        map.put(4, new Officer("Eshwar", 4, "yadgiri", 24, "sp", "B", "male"));

        // Set<Map.Entry<Integer,Officer>> entries  =map.entrySet();
        Set<Map.Entry<Integer, Officer>> entries = map.entrySet();
        for (Map.Entry<Integer, Officer> entry : entries
        ) {
            System.out.println(entry.getKey() + " = " + entry.getValue());

        }
        System.out.println("____________________________________________________________________________________________");
        List<Map.Entry<Integer, Officer>> list = new ArrayList<Map.Entry<Integer, Officer>>(map.entrySet());
        Collections.sort(list, new OfficerComarator());
        for (Map.Entry<Integer, Officer> entry : list
        ) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
        System.out.println("______________________________________________________________________");


Iterator<Map.Entry<Integer,Officer>> iterator =entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Officer> entry= iterator.next();
            System.out.println(entry.getKey()+ " "+entry.getValue());
//            System.out.println(iterator.next());
        }


    }
}
