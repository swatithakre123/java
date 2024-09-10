package A;

 class ArrAssmt3 {
    static int a[] = new int[]{11,12,13,14,15,16,17,18};
    static int alternate()
    {
        for(int i = 0;i<a.length;i++)
        {
           System.out.println(a[i]);
           i++;
        }
        return 0;
    }
  public static void main(String[] args) {
    alternate();
  }  
}
