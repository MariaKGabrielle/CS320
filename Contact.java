/*********************
 * Name: Gabrielle Kirsch
 * Course: CS 320
 *
 */


package Contact;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	private static AtomicLong idGenerator = new AtomicLong();
	
	//Constructor
	
	public Contact(String firstName, String lastName, String number, String address) {
		
		//ContactID
		this.contactID = String.valueOf(idGenerator.getAndIncrement());
		
		//FirstName
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "NULL";
		//if first name is more than ten characters, use first ten
		} else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		} else {
			this.firstName = firstName;
		}
		
		//LastName
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		} else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		} else {
			this.lastName = lastName;
		}
		
		//Number
		if (number == null || number.isEmpty() || number.length() != 10) {
			this.number = "5555555555";
		} else {
			this.number = number;
		}
		
		//Address
		if (address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		} else {
			this.address = address;
		}
	}
	
	//Getters
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getAddress() {
		return address;
	}
	
	//Setters
	
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "NULL";
			
		//if first name longer than 10 characters, use first ten
		} else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		} else {
			this.firstName = firstName;
		}
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		} else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		} else {
			this.lastName = lastName;
		}
	}
	
	public void setNumber(String number) {
		if (number == null || number.isEmpty() || number.length() != 10) {
			this.number = "5555555555";
		} else {
			this.number = number;
		}
	}
	
	public void setAddress(String address) {
		if (address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		} else {
			this.address = address;
		}
	}
}