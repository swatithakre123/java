package A;

 class _6Arr {
    public static void main(String[] args) {

        int a[]=new int[]{2,4,7,9,4,3,12};
        int b=4;
        int newA[]=new int[a.length+1];

        for(int i=0;i<a.length;i++)
        {
            
                newA[i]=a[i];
            }
         newA [newA.length-1]=b;
         for(int i=0;i<newA.length;i++)
         {
            System.out.println(newA[i]);
         }
        }
    }

