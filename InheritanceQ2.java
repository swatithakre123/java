class shape{
    public double calculateArea(){
        return 0;
    }
}
class Circle extends shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends shape{
    private double width;
    private double length;
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public double calculateArea(){
        return length*width;
    }
}
public class InheritanceQ2 {
    public static void main(String[] args) {
    Circle circle=new Circle(10);
    System.out.println("Area of circle: "+circle.calculateArea());
    Rectangle r = new Rectangle(10, 5);
    System.out.println("Area of Rectangle: "+r.calculateArea());
    }
}
