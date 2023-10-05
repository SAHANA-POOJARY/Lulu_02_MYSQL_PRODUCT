package Product;



	import java.sql.SQLException;

	public class ControllerTester {

		

		public static void main(String[] args) throws SQLException {

			// TODO Auto-generated method stub

	 

			Product bl= new Product();
			bl.readData();
	     	bl.createData();

			bl.readData();

	     	bl.deletData();

	    	bl.readData();

			bl.updateData();

			bl.readData();
			//bl.tryBatchMore();
	 

	 

		}

		

	 

	}

	 

