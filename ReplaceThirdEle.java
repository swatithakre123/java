package A;
 class ReplaceThirdEle {
    static int a[] =new int []{2,6,4,7,23,12,9};
    static int replaceThird()
    {
        for(int i=0;i<a.length;i++)
        {
            if (i==3)
            {
                a[3]=99;
                
            }
            System.out.print(" "+a[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        replaceThird();
    }
}
