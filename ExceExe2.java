 package A;
 class ExceExe2 {
    public static void main(String[] args) {
       
        
        try{
            int a=4/0;
            System.out.println("Tripti");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("swati");

        try{
            String name = null;
            int a = 5;
            System.out.println(name.length());
            }
        catch(NullPointerException e)
        {
            System.out.println(e);
            
            e.printStackTrace();
        }
    }
    
}
