package Practise;

import java.util.ArrayDeque;
import java.util.Deque;

class Ddeque {
    public static void main(String[] args) {
        Deque<String> q1 = new ArrayDeque<>();

        q1.add("Swati");
        q1.add("lokesh");
        q1.add("purnima");
        q1.add("Sonam");
        q1.add("sonali");
      System.out.println(q1);
        q1.addFirst("info beans");
      System.out.println(q1);
        q1.addLast("Student");
      System.out.println(q1);
        q1.push("Anushka");
      System.out.println(q1);
        q1.remove();
        System.out.println(q1);
        q1.remove("sonam");
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
    }
}
