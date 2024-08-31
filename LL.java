package Practise;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class LL {
    public static void main(String[] args) {
        LinkedList <Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(23);
        l1.add(4);

        System.out.println(l1);

        l1.addFirst(5);
        System.out.println(l1); //[5,1,2,23,4]
       System.out.println( l1.getLast()); //4

       System.out.println(l1.get(2)); //2
       System.out.println(l1.getFirst()); //5
       l1.remove(1);
       System.out.println(l1); //[5,2,23,4]
       l1.remove();
       System.out.println(l1); //[2,23,4]

       Collections.unmodifiableList(l1);
       l1.add(24);
       System.out.println(l1);  //[2,23,4,24]
       l1.set(1, 21);
       System.out.println(l1);  //[2,21,4,24]

       List<Integer> obj = Collections.unmodifiableList(l1);
        // obj.add(26);
         System.out.println(l1); //[2,21,4,24]
         l1.reversed();
         
    }
}
