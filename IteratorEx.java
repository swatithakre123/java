package Practise;

import java.util.*;

class IteratorEx {
    public static void main(String[] args) {
        
    
    HashSet<String> hs = new HashSet<>();
    hs.add("yyg");

    hs.add("Swati");
    hs.add("Saloni");
    hs.add("Ramya");
    hs.add("Isha");
//Que1
    hs.add("sharvari");
    //Que 2
    Iterator itr =hs.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
        //Que3
        System.out.println("number of element in hashset "+ hs.size());
    }
 //que 4

 //hs.clear();
 //System.out.println("Empty set is "+hs);

 //Que 5
 if(hs.isEmpty())
 {
    System.out.println("Set is Empty");
 }
 else
 {
    System.out.println("Set is not Empty");
 }
 //Que 6
 HashSet<String> hs2 =(HashSet)hs.clone();
 System.out.println(hs2);
 // Que 7
 String[] new_Array = new String[hs.size()];
 hs.toArray(new_Array);
 System.out.println("Array Element:  ");
 for(String element: new_Array)
 {
    System.out.println(element);
 }
  //Que8

  TreeSet<String> ts =new TreeSet<>();

 for(String element:ts)
 {
    System.out.println(element);
 }
  //
    
}
}
