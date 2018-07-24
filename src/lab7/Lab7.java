package lab7;

//Darby O'Rear 7/23

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


public class Lab7 {
	

//First, set up main method. Start it with prompting the user to enter various kinds of information.
//Then, call the appropriate method.
	
	public static void main(String[] args) {
		boolean dateFormatIsValid = false;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");

		Scanner scnr = new Scanner(System.in);
		System.out.println("Hello! Welcome to this form. Please fill out your contact information." );
		System.out.println();
		
//First, use getString() to validate name.
		String var = getString(scnr, "Please enter your first name: ");
		
	if(var.matches("[A-Z][a-z]+")) {
		System.out.println("Hi, " + var + "!");
	}
	else {
		System.out.println("Sorry, that's not a valid name.");
	 }
	
	//Next, ask for email address and validate.
	var = getString(scnr, "Please enter your email address: ");
	 if(var.matches("[a-z\\|0-9]{5,30}@[a-z\\|0-9]{5,10}\\.[a-z\\|0-9]{2,3}")) {
		 System.out.println("Email is valid.");
	 } else {
		 System.out.println("Sorry, that's not a valid email address.");
	 }
	 
	 //Next, ask for phone number and validate.
	 var = getString (scnr, "Please enter your 10-digit phone number in the format ###-###-####: ");
	 if(var.matches("[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}")) {
		 System.out.println("Phone number is valid.");
	 } else {
		 System.out.println("Sorry, that's not a valid phone number.");
	 }
	 
	 //Ask the user to enter their birthday and validate.
	 var = getString (scnr, "Please enter your birthday in the format mm/dd/yyyy: ");
	 if(var.matches("[0-1][0-9]\\/[0-3][0-9]\\/[1-2][0-9][0-9][0-9]")){
		 dateFormatIsValid = true;
	 }
	 else {
		 dateFormatIsValid = false;
		 System.out.println("Sorry, that's not a valid date.");
	 }
	 if(dateFormatIsValid) {
//		 LocalDate newDate = LocalDate.parse(var, formatter);
//		 System.out.println(newDate);
		 System.out.println("Birthday is valid.");
	 }
		 
	}

	public static String getString(Scanner scnr, String prompt) {
		System.out.print(prompt);
			try {
				String var = scnr.next();
				return var;
			} catch (InputMismatchException e) {
				System.out.println("Enter your name.");
				scnr.next();
				return getString(scnr, prompt);
			}
		}
			
}
		
		
	
	

