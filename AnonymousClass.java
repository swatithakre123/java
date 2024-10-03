package A;

interface Person{
    void show();
}

/**
 * AnonymousClass
 */
public class AnonymousClass {
public static void main(String[] args) {
    Person p = new Person(){
        public void show(){
            System.out.println("show");
        }
    };
    p.show();
}
    
}
