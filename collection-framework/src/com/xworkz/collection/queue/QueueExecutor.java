package com.xworkz.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExecutor {
    public static void main(String[] args) {
        Queue queue= new PriorityQueue();
         queue.add("Conway");
         queue.add("Rachin");
         queue.add("Willaimson");
         queue.add("Mitchhel");
         queue.add("Latham");
         queue.add("Glenn");
         queue.add("Santner");
         queue.add("Southee");
         queue.add("henry");
         queue.add("boult");
        System.out.println(queue);
        System.out.println("The size of a list is "+queue.size());
      //  queue.add(6,"Stoinis");
        //System.out.println("List after stoinis  got added");
        System.out.println(queue);
        System.out.println(queue.size());
        queue.add("boult");
        System.out.println(queue);
        queue.add(null);
        queue.add(null);
        queue.add("boult");
        System.out.println(queue);
        System.out.println(queue.size());

    }
}
