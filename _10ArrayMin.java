 class _10ArrayMin {
    static int a[] ={4,8,9,10,11};
    static int Min()
    {
        int min= a[0];
        for(int i=0;i<a.length;i++)
        {
            if(min<=a[i])
            {
                min=a[i];
                return min ;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(Min());
    }
    
}
