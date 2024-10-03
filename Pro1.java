package SRC;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

 class InsertData {

	public static void main(String[] args) {
		
		String url = "jdbc:MySQL://localhost:3306/school";         //db is the name of the database
		String user ="root";                                                  
		String password = "swati123";

		try {

			//1. Create a connection
			Connection myConn = DriverManager.getConnection(url,user,password);
			
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute Query
			String sql = "insert into student "
					+"(Sno,Sname, Address, Fees  , Course )"
					+ " values (111, 'Tripti Patel','Joshi Colony',25000, 'ITEP')";
			myStmt.executeUpdate(sql);
			System.out.println("Insert complete.");

            //4. Close connection
			myConn.close();
		}

		catch(Exception e){
            e.printStackTrace();
		}
	}
}