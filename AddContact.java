package com.bridgelabz.addressbook;
import java.util.Scanner;

public class AddContact {
	 private String firstName;
	    private String lastName;
	    private long phoneNumber;
	    private String email;
	    private String address;
	    private String city;
	    private String state;
	    private int zipCode;

	    public String setFirstName(String firstName){
	        this.firstName = firstName;
	        return firstName;
	    }
	    public String setLastName(String lastName){
	        this.lastName = lastName;
	        return lastName;
	    }
	    public long setPhoneNumber(long phoneNumber){
	        this.phoneNumber = phoneNumber;
	        return phoneNumber;
	    }
	    public String setEmailId(String email){
	        this.email = email;
	        return email;
	    }
	    public String setAddress(String address){
	        this.address = address;
	        return address;
	    }
	    public String setCity(String city){
	        this.city = city;
	        return city;
	    }
	    public String setState(String state){
	        this.state = state;
	        return state;
	    }
	    public int setZips(int zipCode) {
	        this.zipCode = zipCode;
	        return zipCode;
	    }
	    public static void main(String[] args) {

	        AddContact person = new AddContact();

	        System.out.println("add person details");
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter person first name: ");
	        person.setFirstName(sc.next());

	        System.out.println("Enter person last name: ");
	        person.setLastName(sc.next());

	        System.out.println("Enter mobile number: ");
	        person.setPhoneNumber(sc.nextLong());

	        System.out.println("Enter Email id: ");
	        person.setEmailId(sc.next());

	        System.out.println("Enter address: ");
	        person.setAddress(sc.next());

	        System.out.println("Enter city: ");
	        person.setCity(sc.next());

	        System.out.println("Enter State : ");
	        person.setState(sc.next());

	        System.out.println("Enter zip code : ");
	        person.setZips(sc.nextInt());

	     
	        System.out.println("Name : " + person.firstName + " " + person.lastName + "\nPhone number : " + person.phoneNumber +
	                           "\nEmail  : " + person.email + "\nAddress : " + person.address + "\nCity : " + person.city +
	                           "\nState : " + person.state + "\nZipCode : " + person.zipCode);
	    }
}
