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
	    

	    public String getFirstName() {
			return firstName;
		}
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
	    public String setEmail(String email){
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
	    public int setZipCode(int zipCode) {
	        this.zipCode = zipCode;
	        return zipCode;
	    }
	    @Override
	    public String toString() {
	        return "\nPerson Info [first Name = " + firstName + ", last Name = " + lastName + ", Email id = " + email +
	                ", address = " + address + "," + " city = " + city + ", state = " + state + ", zipcode = " + zipCode + ", " +
	                "phoneNumber = " + phoneNumber + "]\n";
	        }
	
}
