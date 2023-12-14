package Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Displayname;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import Contact.Contact;
import Contact.ContactServicel

import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {
	
	
	@Test
	@DisplayName("Test to Update First Name.")
	@Order(1)
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("Jane", "Dolittle", "5555551234", "123 Smithson Lane");
		service.updateFirstName("James", "9");
		service.displayContactList();
		assertEquals("James", service.getContact("9").getFirstName(), "First name was not updated.");
	}
	
	@Test
	@DisplayName("Test to Update Last Name.")
	@Order(2)
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("Jane", "Dolittle", "5555551234", "123 Smithson Lane");
		service.updateLastName("Dobson", "11");
		service.displayContactList();
		assertEquals("Dobson", service.getContact("11").getlastName(), "Last name was not updated.");
	}
	
	@Test
	@DisplayName ("Test to Update Phone Number.")
	@Order(3)
	void testUpdatePhoneNumber() {
		ContactService service = new ContactService();
		service.addContact("Jane", "Dolittle", "5555551234", "123 Smithson Lane");
		service.updateNumber("5555551235", "17");
		assertEquals("5555551235", service.getContact("17").getNumber(), "Phone number was not updated.");
	}
	
	@Test
	@DisplayName("Test to Update Address.")
	@Order(4)
	void testUpdateAddress() {
		ContactService service = new ContactService();
		service.addContact("Jane", "Dolittle", "5555551234", "123 Smithson Lane");
		service.updateAddress("456 Nothere Ave", "15");
		service.displayContactList();
		assertEquals("456 Nothere Ave", service.getContact("15").getAddress(), "Address was not updated.")
	}
	
	@Test
	@DisplayName("Test to ensure that service correctly deletes contacts.")
	@Oder(5)
	void testDeleteContact() {
		ContactService service = new ContactService();
		service.addContact("Jane", "Dolittle", "5555551234", "123 Smithson Lane");
		service.deleteContact("17");
		//ensures contactList is empty by creating new empty contactList to compare to
		ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
		service.displayContactList();
		assertEquals(service.contactList, contactListEmpty, "The contact was not deleted.");
	}
	
	@Test
	@DisplayName("test to ensure that servie can add a contact.")
	@Order(6)
	void testAddContact() {
		ContactService service = new ContactService();
		service.addContact("Jane", "Dolittle", "5555551234", "123 Smithson Lane");
		service.displayContactList();
		assertNotNull(service.getContact("0"), "Contact was not added correctly.");
	}

}
