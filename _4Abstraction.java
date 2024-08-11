 class Abstraction {
    public static void main(String[] args)
     {
        Rectangle r=new Rectangle();
        r.area();
        r.getcolor();
    }
}
abstract class Shape1
{
    String color;
   void getcolor()
   {
    System.out.println("color");
   }
   abstract double area();

}
class Rectangle extends Shape1
{
double area()
{
    System.out.println("area of rectangle");
    return 23;
}
}
