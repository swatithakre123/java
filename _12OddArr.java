 class OddArr {
    static int a[] ={4,6,8,9,3,5};
    static int Odd()
    {
        for(int i=0;i<a.length;i++)
        {
          if(a[i]%2!=0)
          {
            System.out.println(a[i]);
          }
        }
        return 0;
    }
    public static void main(String[] args) {
        Odd();
    }
}
