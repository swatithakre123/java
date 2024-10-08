package B;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

class bankManagement {
    private static final int Null=0;

    static Connection con = connection.getConnection();
    static String sql="";
    public static boolean createAccount(String name,int passCode){
        try{
            //validation
            if(name==""|| passcode== NULL){
                System.out.println("All Field Required!");
                return false;
            }
            //query
            Statement st = con.createStatement();
            sql="INSERT INTO customer(cname,balance,pass_code)values("+name+ ",1000,"+passCode")";
            //Execution
            if(st.executeUpdate(sql)==1){
                System.out.println(name +"Now you Login! ");
                return true;
            }
            //return
        }
        catch(SQLIntegrityConstraintViolationException e){
           System.out.println("Username Not Available!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean LoginAccount(String name ,int passCode){
        try{
            //validation 
            if(name==""|| passCode==Null){
             System.out.println("All Field Required!");
             return false;
            }
            //query
            sql="Select * from customer where cname="+name+"and pass_code="+passCode;
            PreparedStatement st= con.prepareStatement(sql);
            ResultSet rs= st.executeQuery();

            //Execution

            BufferedReader sc= new BufferedReader(new InputStreamReader(System.in))
        }
    }
    }
}
