package Practise;

import java.util.ArrayList;
import java.util.Collections;

class Practise1 {
    
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        
        list.add("Blue");
        list.add("white");
        list.add("Purple");

        System.out.println(list);
    
        // que 2

        
       
        for(String i:list)
        {
            System.out.println(i);
        }
     // que 3

     list.addFirst("Voilet");

     System.out.println(list);
     
     // que 4

     System.out.println(list.get(1));

     // que 5

     list.set(1, " Black");
     System.out.println(list);

     // que 6

     list.remove(2);
     System.out.println(list);

     //que 7
     
     System.out.println(list.contains("blue"));


     //que 8

     list.sort(null);
     Collections.sort(list);

     //que 9
     //shallow copy    
    ArrayList<String> l2 =(ArrayList)list.clone();
    System.out.println(l2);

     //deep copy
     ArrayList list1 = new ArrayList(list);
    System.out.println(list1);
     
     // que 10
      Collections.shuffle(list);
      System.out.println(list);

     //que 11

     System.out.println(list.reversed());

     // que 12
     ArrayList <String> list2 = new ArrayList<>();
     list2.add("dog");
     System.out.println(list.equals(list2));

     //que 13

     Collections.swap(list, 1, 2);
     System.out.println(list);

     // que 14
    
     list.trimToSize();
     System.out.println(list);

     // que 15
     for(int i = 0;i<list.size();i++)
     {
    System.out.println( i+ "  "+list.get(i));
    
     }
     
     
    }
}
