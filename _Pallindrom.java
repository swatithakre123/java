import java.util.Scanner;
class _Pallindrom {
    public static void main(String[] args) {
       Scanner sct=new Scanner(System.in);
       System.out.println("enter the number"); 
       int num=sct.nextInt();
       int x=num,rev=0;


       while(num!=0)
       {
        int rem=num%10;
        rev=(rev*10)+rem;
        num=num/10;
        
       }
       
       if(rev==x)
       {
        System.out.println("number is pallindrom");
       }
       else{
        System.out.println("number is not pallindrom");
       }
       sct.close();
    }
    
}
