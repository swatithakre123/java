 class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
     void Displaydetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}
/**
 * InheritanceQ1
 */
class Employee extends Person{
double salary;

Employee(String name,int age, double salary){

    super(name,age);
    this.salary=salary;
}
 void Displaydetails(){
  super.Displaydetails();
  System.out.println("Salary: "+salary); 
}
}
public class InheritanceQ1 {
public static void main(String[] args) {

    Person person= new Person("swati" ,30);
    System.out.println("Person Details: ");
    person.Displaydetails();

    Employee employee = new Employee("swati", 30,50000);
    System.out.println("\nEmployee Details:");
    employee.Displaydetails(); 
}
}

