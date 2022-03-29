package assignment2;

import java.sql.*; 
import java.util.Scanner;


//Usually, the user can only interact with the view.
//and the Controller will handle all the logics and communicate between Model and View
public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Create a view
		StudentView ui = new StudentView();
		
		
		System.out.print("1. Input Marks \n2. Check Student's Mark \nSelect: ");
		int option = input.nextInt();
		
		//display different view base on the option
		ui.displayMenu(option);
		
	
	}
}
