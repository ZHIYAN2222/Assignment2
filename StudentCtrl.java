package assignment2;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.ResultSetMetaData;
	import java.sql.Statement;
	import java.sql.*;
	
	public class StudentCtrl {
		
		 private Student model;
	     private StudentView ui;
	     
	     //constructor with model and ui arguments
	     public StudentCtrl(Student model, StudentView ui){
	         this.model = model;
	         this.ui = ui;
	      }
	     
	     // method to retrieve certain student from database
	     public void getStudent(int stuId) throws SQLException{
	    	 
	    	 // create new Student object to hold data
	    	 Student stu = new Student();
	    	 
	    	 //Establish connection
	    	 String URL = "jdbc:mysql://127.0.0.1:3306/db1?serverTimezone = UTC" ;
		     String Username = "root";
		     String password = "Hello0325@";
		     
			Connection conn = DriverManager.getConnection(URL, Username, password);
			
				//Query to retrieve data for certain student with id
	 			String mySQL = "SELECT * FROM STUDENT where stuID ='" + stuId +"'";
	 			
	 			//execute the SQL statement
	 			Statement stmt = conn.createStatement();
	 			ResultSet rs = stmt.executeQuery(mySQL);
	 			if (rs.next()) {
	 				
	 				stu.setStuId(rs.getInt("stuId"));
	 				stu.setName(rs.getString("name"));
	 				stu.setDepartment(rs.getString("department"));
	 				stu.setMathMark(rs.getInt("mathMark"));
	 				stu.setScienceMark(rs.getInt("scienceMark"));
	 				
	 		    } 
	 		 // pass the data to ui object and display
	    	 ui.displayStudentMarks(stu.getStuId(), stu.getName(), stu.getDepartment(), stu.getMathMark(), stu.getScienceMark());
	     }
	     
	     // method for user to insert new data into database
	     public void inputMark(int stuId, String name, String department, int mathMark, int scienceMark) throws SQLException {
	 		
	    	 Student stu = new Student();
	    	 String URL = "jdbc:mysql://127.0.0.1:3306/db1?serverTimezone = UTC" ;
		     String Username = "root";
		     String password = "Hello0325@";
			Connection conn = DriverManager.getConnection(URL, Username, password);
	  
	 			Statement stmt = conn.createStatement();
	 			
	 		// insert the data into database
	 		stmt.executeUpdate("INSERT INTO STUDENT VALUES (" + stuId + ", '"+ name + "', '" +
	 		department + "', " + mathMark + ", " + scienceMark + ")");
	 		
	 		System.out.println("Input Sucessfuly!");
	 	}
	     
	}


