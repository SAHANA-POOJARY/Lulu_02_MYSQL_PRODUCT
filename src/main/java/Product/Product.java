package Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.lulu.Employee.ConnectDB;

//import Product.ConnectDB;



public class Product {
	
	void createData() throws SQLException {
		Connection connection = ConnectDB.setupConnection();
		String query ="INSERT INTO Product ( id, name, cost,Descrb  ) VALUES( ?, ?,?,?)";
//		String query = "insert values into employee(? ,? ,?)  ";
		PreparedStatement myStmt = connection.prepareStatement(query);
		myStmt.setInt(1, 444);
		myStmt.setString(2, "T-shirt");
		myStmt.setInt(3, 1000);
		myStmt.setString(4, "Cotton");

		int success = myStmt.executeUpdate();
		System.out.println("Added Successfully " + success);
     	}
	
	void readData() throws SQLException {

		Connection connection=ConnectDB.setupConnection();

 

		 Statement statement;

		 statement = connection.createStatement();

         ResultSet resultSet;

         resultSet = statement.executeQuery(

             "select * from Product where id>=111");

         int id;

         String name;

         int cost;
         String desc;

         while (resultSet.next()) {

             id = resultSet.getInt("id");

             name = resultSet.getString("name");

             cost=resultSet.getInt("cost");
             desc = resultSet.getString("Descrb");

             System.out.println("id :" + id

                                + " name :" + name +"  cost of product:"+ cost+"  description:" +desc);

         }


	}
	void deletData() throws SQLException  {

		Connection connection = ConnectDB.setupConnection();

		String query = "delete from Product where id = ? ";

		PreparedStatement myStmt = connection.prepareStatement(query);

		myStmt.setInt(1, 444);

		boolean success = myStmt.execute();

		System.out.println("Deleted Successfully " + success);

 

 

 

	}
	void updateData() throws SQLException   {

		Connection connection = ConnectDB.setupConnection();

		String query = "update Product set name= ? where id = ? ";

		PreparedStatement myStmt = connection.prepareStatement(query);

		myStmt.setString(1, "Tops");

		myStmt.setInt(2, 333);
		

		int success = myStmt.executeUpdate();

		System.out.println("Update Successfully " + success);

 

 

 

	}
	


}
