package A;
import java.util.InputMismatchException;
import java.util.Scanner;
 class ExceExe3 {
    public static void main (String [] args)
    {
        Scanner stc= new Scanner(System.in);
        try{
            System.out.println("Enter the value of 1st number ");
            int a = stc.nextInt();
            System.out.println("Enter the value of 2nd number");
            int b = stc.nextInt();
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator can not be Zero");
            e.printStackTrace();
        }
        catch(InputMismatchException e)
        {
          System.out.println("please enter integer only ");
        }
        System.out.println("At the End.............");
    }
    
}
