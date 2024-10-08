package B;
import java.util.Scanner;
 class DmartBilling {
    private double amount;
    DmartBilling(double amount){
        this.amount=amount;
    }
   public void Discount()
   {
     if(amount>=3000 && amount < 5000)
     {
       amount= amount-500;
       System.out.println(" wooohooo !...... \n you get a Flat Discount of Rs. 500 ");
       System.out.println(" your amount is = "+amount); 
     }
     else {
     if(amount >= 5000 && amount <10000){
        double discount = 0.3* amount;
      amount=amount - discount;
      System.out.println(" Congratulations!............\n  You get 30% Discount of Rs  "+discount);
      System.out.println("Your amount is = "+ amount);
     }
     else{
        if(amount>10000)
        {
            if(amount>10000 && amount < 15000)
            {
                System.out.println("Congratulations !............\n You get FREE Mixer for your purchase ");
                System.out.println("Your amount is = "+ amount);
            }
            else{
                System.out.println(" Congratulations !........\n You get FREE Suitcase for your purchase");
            }
        }
        else{
            System.out.println(" Thankyou for purchasing ");
            System.out.println(" Your amount is = "+amount);
        }
     }
    }
   }
} 
class main{
    public static void main(String[] args) {
        
        Scanner stc = new Scanner(System.in);
        try{
        System.out.println("Enter your Amount ");
        double amount = stc.nextDouble();
        DmartBilling amt = new DmartBilling(amount);
        if(amount<= 0)
        {
            System.out.println("Please Enter valid Number ");
        }
        amt = new DmartBilling(amount);
        amt.Discount();

        }
        catch(NumberFormatException e)
        {
           e.printStackTrace();

        }
        finally{
            stc.close();
        }

    
    }
}

