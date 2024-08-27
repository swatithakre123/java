
import java.util.*;
 class Animal {
    public static void main(String[] args) {
     Scanner stc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = stc.nextLine();
        System.out.println(" Enter the index no. of Character you want ");
        int n = stc.nextInt();

        for(int i= 0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(i == n)
            System.out.println(" the character on the given index is "+ str.charAt(n));
        }
        stc.close();
    }
}
