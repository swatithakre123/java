interface Bike{
    default String testvehicle()
    {
        return "vehicle in good";
    }
}
interface car{
default String testvehicle()
{
    return "car in good";
}
}
public class MultipleInterface implements car,Bike {
    public String testvehicle() {
        return Bike.super.testvehicle() + "\n " + car.super.testvehicle();
    }
    public static void main(String[] args) {
        MultipleInterface n = new MultipleInterface();
       System.out.println( n.testvehicle());
    }

        
        
    
}
