package A;
class ALE{
    static int a[]=new int []{1,4,2,6,15,34,45,3,5,9};
    static int LastEle()
    {
        for(int i=0;i<a.length;i++)
        {
            if (i==a.length-1)
            {
                System.out.println(a[i]); 
            }
        }return 0;

    }
    public static void main(String[] args) {
        LastEle();
    }
}


