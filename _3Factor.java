class abst{
    public static void main(String[] args) {
       Child c=new Child();
       c.Bark();
       c.Showdata(); 
    }
}

abstract class Abstraction
{
    abstract void Bark();
    public void Showdata()
    {
        System.out.println("bark");
    }
        
    }
    class Child extends Abstraction
    {
void Bark(){
    System.out.println("Bhau Bhau......");
}
    }

