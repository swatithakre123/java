package A;
import java.util.Scanner;
class Exception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = s.nextInt();
        try{
            System.out.println(10/n);
            String name=null;
            System.out.println(name.length());
        }
        catch( ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
         System.out.println(e);
        }
        s.close();
    }
}
