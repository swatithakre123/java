package SRC;

import java.util.Scanner;
import java.sql.*;
class CRUDoperation {
    private static final String URL = "jdbc:mysql://localhost:3306/test_db?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "swati123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}


class Implementation
 {
   public void SelectEmployee() {
        String sql = "SELECT id, name, email, country, salary FROM employees WHERE id = ?";
        try{Connection conn = CRUDoperation.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql); 
                pstmt.setInt(1, 1);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Email: " + rs.getString("email"));
                    System.out.println("Country: " + rs.getString("country"));
                    System.out.println("Salary: " + rs.getDouble("salary"));
                }
            } catch (SQLException e) {
                CRUDoperation.printSQLException(e);
            }
       }
    
       public void insertEmployee() {
            String sql = "INSERT INTO employees (name, email, country, salary) VALUES (?, ?, ?, ?)";
            try {Connection conn = CRUDoperation.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(sql);
                 System.out.println("Enter your name ");
                 Scanner sc=new Scanner(System.in);
                 String name = sc.nextLine();
                   pstmt.setString(1,name );
                   System.out.println("Enter your mail Id ");
                   String email = sc.nextLine();
                   pstmt.setString(2, email);
                   System.out.println("Enter your Country");
                   String con = sc.nextLine();
                   pstmt.setString(3, con);
                   System.out.println("Enter your Salary");
                   double sal= sc.nextDouble();
                   pstmt.setDouble(4, sal);
                   pstmt.executeUpdate();
                   System.out.println("Record created.");
               } catch (SQLException e) {
                  CRUDoperation.printSQLException(e);
               }
            }
          
       
          public void updateEmployee (){
               String sql = "UPDATE employees SET name = ?, email = ?, country = ?, salary = ? WHERE id = ?";
               try {Connection conn = CRUDoperation.getConnection();
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                   pstmt.setString(1, "Jane Doe");
                   pstmt.setString(2, "jane.doe@example.com");
                   pstmt.setString(3, "Canada");
                   pstmt.setDouble(4, 60000.00);
                   pstmt.setInt(5, 1);
                   pstmt.executeUpdate();    
                   System.out.println("Record updated.");
               } catch (SQLException e) {
                   CRUDoperation.printSQLException(e);
               }
          }
       
          public void deleteEmployee () {
               String sql = "DELETE FROM employees WHERE id = ?";
               try 
               {Connection conn = CRUDoperation.getConnection();
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                   pstmt.setInt(1, 1);
                   pstmt.executeUpdate();
                   System.out.println("Record deleted.");
               } catch (SQLException e) {
                   CRUDoperation.printSQLException(e);
               }
          }
        
          public static void main(String[] args)
           {
          
           int choice;
           Implementation obj=new Implementation();
           
           System.out.println("Welcome to ABC Limited \n Please Enter your Choice");
           System.out.println(" 1. View Employee \n 2. Add New Employee \n 3. Update Existing Employee \n 4. Delete Exisitng Employee ");
           Scanner sc=new Scanner(System.in);
           choice=sc.nextInt();
           
           switch(choice)                              
           {
               case 1: obj.SelectEmployee();break;
               case 2: obj.insertEmployee();break;
               case 3: obj.updateEmployee();break;
               case 4: obj.deleteEmployee();break;
            }
         }
}
