package A;

import java.io.FileInputStream;

class ExepEx {
    public static void main(String[] args) {
       try{
       // System.out.println("Hello InfoBeans Foundation");                                                                         
        //System.out.println("Hello Java ");
        //System.out.println(10/0);
        FileInputStream fis = new FileInputStream("d.xxt");
       }catch ( FileNotFoundException e)
    {
        System.out.println(e);
           e.printStackTrace();

    }
    //System.out.println("learning");
    }
}
