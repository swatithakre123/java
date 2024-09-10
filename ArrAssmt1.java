package A;

class ArrAssmt1 {
    static int a[] = new int[]{22,32,45,22,56,22,78};
    static int Repeat()
    {
     int count=0,temp=0;   
for(int i=0;i<a.length;i++)
{
 for(int j=i+1;j<a.length;j++)
    {
if (a[i]==a[j])
{  
    count++;
    temp=a[i];

}  
 }
}

 System.out.println("the repeating no. is "+temp);
 System.out.println("it repeats " +count +" times");
return 0;
    }

    public static void main(String[] args) {
       Repeat();
    }
}
