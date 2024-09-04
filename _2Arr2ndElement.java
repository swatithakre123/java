package A;
 class Arr2ndElement {
    static int a[]=new int[]{2,5,7,9,4};
    static int element()
    {
        for(int i=0;i<a.length;i++)
        {
            if(i==1)
            {
                System.out.println(a[i]);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        element();
    }
    
}
