package Practise;

import java.util.HashMap;
import java.util.Map;
 class Hashmap1 {
    public static void main(String[] args) {
        
    
    HashMap<Integer,String> hs = new HashMap<>();
    
    hs.put(01,"Swati");
    hs.put(02,"sonali");
    hs.put(03,"Saloni");

    System.out.println(hs);

    System.out.println(hs.get(02));
    System.out.println(hs.remove(02));

    for(Map.Entry<Integer,String>entry:hs.entrySet())
    {
     Integer K= entry.getKey();
     String V= entry.getValue();
     System.out.println("key is "+K+"  value is "+V);
    } 
    
    }
}
