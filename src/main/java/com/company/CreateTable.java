package com.company;
import java.sql.*;

public class CreateTable {
		public static void main(String[] args) throws SQLException {

				Connection con = null;
				Statement stmt = null;
				int result = 0;

				try {
						// register driver
//           Class.forName("org.hsqldb.jdbc.JDBCDriver");
					 // create connection
					 con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/testdb","SA","");
					 // create statement
					 stmt = con.createStatement();
             // create table
					 result = stmt.executeUpdate("CREATE TABLE tutorials_tbl (\n" +
							 "   id INT NOT NULL,\n" +
							 "   title VARCHAR(50) NOT NULL,\n" +
							 "   author VARCHAR(20) NOT NULL,\n" +
							 "   submission_date DATE,\n" +
							 "   PRIMARY KEY (id) \n" +
							 ");");
						// insert row on the table
//						result = stmt.executeUpdate("INSERT INTO tutorials_tbl VALUES(100,'Learn PHP','John Poul',NOW())");
            // insert many rows
//						result = stmt.executeUpdate("INSERT INTO tutorials_tbl VALUES(101,'Learn C','Yaswanth',NOW())");
//						result = stmt.executeUpdate("INSERT INTO tutorials_tbl VALUES(102,'Learn MySQL','Abdul S',NOW())");
//						result = stmt.executeUpdate("INSERT INTO tutorials_tbl VALUES(103,'Learn Excell','Bavya kanna',NOW())");
//						result = stmt.executeUpdate("INSERT INTO tutorials_tbl VALUES(104,'Learn JDB','Ajith kumar',NOW())");
//						result = stmt.executeUpdate("INSERT INTO tutorials_tbl VALUES(101,'Learn Junit','Sathya Murthi',NOW())");
						// delete table
//						 result = stmt.executeUpdate("DROP TABLE tutorials_tbl");
						// Execute queries
//						PreparedStatement ps = con.prepareStatement("Select * from tutorials_tbl");
//						ResultSet rs = stmt.executeQuery("select * from tutorials_tbl where id = 102");
//						while(rs.next()) {
//							   String title = rs.getString("title");
//								System.out.println(title);
//						}

				} catch (Exception e) {
          e.printStackTrace(System.out);
				}
			  con.close();
		}
}
