package A;

class Shape {
    String color;
   public Shape(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    
    public double area() {
        return 0.0;  // Placeholder for area calculation
    }
    
    public double perimeter() {
        return 0.0;  // Placeholder for perimeter calculation
    }   
}
class Circle extends Shape {
    double radius;
    
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    public double getRadius() {
        return radius;
    }
}
 class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
     public double getWidth() {
        return width;
    }
}
class Test {
    public static void main(String[] args) {
        Circle c= new Circle(4.5, "purple");
        Rectangle r=new Rectangle(2, 4, "Blue");

    System.out.println("Circle color = " + c.getColor());
    System.out.println("Circle Area = " +c.area());
    System.out.println("Area of Rectangle  ="+ r.area());
    }
}

