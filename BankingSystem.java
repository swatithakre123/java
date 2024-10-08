package B;
/**
 * InnerBankingSystem
 */
import java.util.Scanner;
 interface Account {
void deposit(double Amount);
void withdraw (double Amount);
double getbalance();
    
}
abstract class BankAccount implements Account
{
double balance = 50000;
public void deposit(double Amount)
{
balance= balance + Amount;
}
public void withdraw (double Amount)
{
    balance= balance - Amount;  
}
public double getbalance()
{
    return balance;
}
protected BankAccount(double balance)
{
    this.balance= balance;
}

}
class SavingAccount extends BankAccount{
private double interestRate=0.05;
protected SavingAccount(Double balance)
{
    super(balance);
}
void AddInterest()
{
    super.balance= balance+(balance*interestRate);
}
}
class CheckingAccount extends BankAccount{
    protected CheckingAccount(Double balance)
    {
        super(balance);
    }
    public void withdraw (double Amount)
    {
        balance= balance - Amount; 
        balance--;
        System.out.println(" 1RS Withdrawal fee is deducted ");
        if(Amount==balance)
        {
         System.out.println("enter correct Amount");
        }
       
    }
}
 class BankingSystem {
    public static void main(String[] args) {
     SavingAccount sa=new SavingAccount(50000.00);
     CheckingAccount ca= new CheckingAccount(50000.00);
     Scanner stc = new Scanner(System.in);
     sa.AddInterest();
     System.out.println("Welcome to our Banking System !............");
     System.out.println("Enter 1 if you want to deposit the Amount ");
     System.out.println("Enter 2 if you want to withdraw the Amount ");
     int Number = stc.nextInt();
       if(Number==1)
       {
            System.out.println("Enter the deposit Amount");
            int DAmount = stc.nextInt();
            sa.deposit(DAmount);
            System.out.println("Your Amount in Saving Account is = " +sa.getbalance());
       }
      else 
      {
      if(Number==2)
      {
        System.out.println("Enter the withdrawal Amount");
        int WAmount=stc.nextInt();
        ca.withdraw(WAmount);
        System.out.println("After Withdraw " + WAmount+ " Your balance is = " +ca.getbalance());
      }  
      }
      stc.close();
    }
}
