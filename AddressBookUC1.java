package com.bridgelabz.addressbook;
import java.util.Scanner;

public class AddressBookUC1 {
	public String firstName,lastName,address,city,state,zipCode,phoneNum,email;
	public void contact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name :");
		firstName = sc.nextLine();
		System.out.println("Enter Last Name :");
		lastName = sc.nextLine();
		System.out.println("Enter Address :");
		address = sc.nextLine();
		System.out.println("Enter City :");
		city = sc.nextLine();
		System.out.println("Enter State :");
		state = sc.nextLine();
		System.out.println("Enter Zip Code :");
		zipCode = sc.nextLine();
		System.out.println("Enter Phone Number :");
		phoneNum = sc.nextLine();
		System.out.println("Enter Email :");
		email = sc.nextLine();

		System.out.print("FirstName : "+firstName+"\n"+"LastName : "+lastName+"\n"+"Address :"+address+"\n"+
				"City : "+city+"\n"+"State : "+state+"\n"+"ZipCode : "+zipCode+"\n"+
				"Phone Number : "+phoneNum+"\n"+"Email : "+email);

	}
}