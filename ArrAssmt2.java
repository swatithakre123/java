package A;

class ArrAssmt2 {
    static int a[]=new int[]{11,12,13,15,16,17};
    static int missing()
    { int k=a[0];
        int temp=0;
        for(int i =0;i<a.length;i++)
        {

            if(k==a[i]-1)
            {
             k= a[i]; 
            }
            else 
            {
                temp= k+1 ;
            }
        } System.out.println(temp);
    return 0;
}
    public static void main(String[] args) {
        missing();
    }

}
