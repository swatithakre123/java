package Practise;

import java.util.ArrayList;

public class pr2 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(23);
        li.add(2);

        System.out.println(li);
        //Deep copy
        ArrayList<Integer> l2 = new ArrayList<>(li);
        System.out.println(l2);
        //Shallow copy
        ArrayList l3 = (ArrayList)li.clone();
        System.out.println(l3);

        li.set(1, 4);
        System.out.println(l2);
        System.out.println(l3);
    }
}
