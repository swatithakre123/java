package A;
import java.util.Scanner; 
class NotEligibleException extends RuntimeException {

NotEligibleException(String msg)
{
    System.out.println("You are NOT Eligible for voting");
}
}
class Que14{


    public static void main(String[] args) {
        Scanner Stc = new Scanner (System.in);
        System.out.println("Enter the  your Age");
        int age = Stc.nextInt();

        try{
            if(age<18)
            {
                throw new NotEligibleException("you are not eligible for voting ! /n THANKYOU ");
            }
            else{
                System.out.println("you are Eligible for voting");
            }

        
        }
        catch(NotEligibleException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
