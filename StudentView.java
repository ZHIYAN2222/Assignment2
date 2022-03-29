package assignment2;

import java.sql.SQLException;
import java.util.Scanner;

//Receive data from user and send it to controller to save it on the database.
//Receive student id from user and send it to controller to retrieve the data from database

public class StudentView {
	
	public void displayMenu(int option) {
		
		// create a student object(Model)
		Student s = new Student();
		
		// create a controller
		StudentCtrl controller = new StudentCtrl(s,this);
		Scanner input = new Scanner(System.in);
		
		if(option == 1) {
			try {
			//Receive data from user
			System.out.println("\nInsert student data");
			System.out.print("Student ID: ");
			int stuId = input.nextInt();
			
			System.out.print("Name: ");
			String name = input.next();
			
			System.out.print("Department: ");
			String department = input.next();
			
			System.out.print("Math mark: ");
			int mathMark = input.nextInt();
			
			System.out.print("Science mark: ");
			int scienceMark = input.nextInt();
			
			//Send data to Controller class
			controller.inputMark(stuId, name, department, mathMark, scienceMark);
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		else if (option == 2){
			
		//Get student id from user
		System.out.print("\nEnter student id: ");
		int studentID = input.nextInt();
		
		try {
			//Send student id to Controller class
			controller.getStudent(studentID);
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	}
	//Method to display student's marks
	public void displayStudentMarks(int studentId, String name, String department, int math, int science){
        System.out.println("\nStudent Marks");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Math: " + math);
        System.out.println("Science: " + science);
     }
	
}
