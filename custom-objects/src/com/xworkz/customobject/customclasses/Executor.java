package com.xworkz.customobject.customclasses;

import java.util.*;

public class Executor {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Mobile(1,"Vivo","1.0","12-2-2023"));
        list.add(new Mobile(2,"Samsung","2.0","11-11-2020"));
        list.add(new Laptop(1,"Dell","1.4"));
        list.add(new Bus(1,"KSRTC","red"));

       // System.out.println(list);
        for (Object e:list
             ) {
            System.out.println(e);

        }

        Set set = new TreeSet();
        set.add(new Mobile(1,"Vivo","1.0","12-2-2023"));
        set.add(new Mobile(2,"Samsung","2.0","11-11-2020"));
       set.add(new Laptop(1,"Dell","1.4"));
        set.add(new Bus(1,"KSRTC","red"));
        System.out.println(set);
        for (Object e:set
             ) {
            System.out.println(e);

        }
        Queue queue = new PriorityQueue();
        queue.add(new Mobile(1,"Vivo","1.0","12-2-2023"));
        queue.add(new Mobile(2,"Samsung","2.0","11-11-2020"));

        queue.add(new Laptop(1,"Dell","1.4"));
        queue.add(new Bus(1,"KSRTC","red"));
        for (Object w:queue
             ) {
            System.out.println(w);
        }
        Set set1 = new HashSet();













    }
}
