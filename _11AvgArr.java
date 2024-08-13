 class AvgArr {
    static int a[]={4,2,5,8,12,13};

    static int Avg()
    {
        int sum = a[0];
        for(int i=1;i<a.length;i++)
        {
          sum = sum + a[i];
          

        }
        System.out.println(sum);
        float avg= sum/a.length;
        System.out.println("The Avrage is " + avg );
        return 0;
    }

    public static void main(String[] args) {
        Avg();
    }

}
