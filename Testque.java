package Practise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

class Students {
    private String name;
    private int eng;
    private int java;
    private int c;

    Students(String name , int eng,int java,int c){
        this.name= name;
        this.eng = eng;
        this.java = java;
        this.c = c;
    }
    public String getName(){
      return this.name;  
    }
   public int geteng(){
    return this.eng;
   }
   public int getjava(){
    return this.java;

   }
   public int getc(){
    return this.c;
   }
   public int getTotal(){
    int total= this.eng + this.java + this.c;
    return total;
   }
   public String toString(){
    return this.name+" "+ this.eng+" "+this.java+" "+this.c;
   }
}
class StudentObjectInArrayList {
  public static void main(String[] args) {
    ArrayList<Students> obj = new ArrayList<>();
    obj.add(new Students("Swati", 87, 78, 65));
    obj.add(new Students("Harris", 67, 87, 75));
    obj.add(new Students("Bhavin", 80, 67, 68));
    obj.add(new Students("Rohit", 87, 78, 65));

    for(Students student:obj){
      if(Practise.Students.getName().startsWith("H"))
      {
        System.out.println(student);
      }
    }
    Iterator<Students>iterator=obj.iterator();
    while (iterator.hasNext()) {
      Students students=iterator.next();
      if(students.getName().startsWith("B"))
      {
        iterator.remove();
      }
    }
    int total=0;
    for(Students students:obj)
    {
      total += students.getTotal();
        }
        int average = total/obj.size();
        System.out.println(average); 
    
    
  }
}