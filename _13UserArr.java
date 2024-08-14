import java.util.Scanner;
class _13UserArr {
    public static void main(String[] args) {
        Scanner stc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int s =  stc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the Array");
        for(int i=0;i<s;i++)
        {
            arr[i]=stc.nextInt();
        }
        for(int i=0;i<s;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
