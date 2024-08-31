 import java.util.Scanner;
 class Que20 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxy";
        Scanner stc= new Scanner(System.in);
     System.out.println("Enter in which number you want to break the String");
        int n = stc.nextInt();
      for(int i= 0 ;i<str.length();i++)
      {
        
        if(i==n)
        {
            String newstr = "";
            newstr=newstr+str.substring(0,n);
            System.out.println(newstr);
        }
      
       
      }
    }
}
