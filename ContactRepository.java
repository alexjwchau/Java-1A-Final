
/** This Class includes a some features of contact like reading the contact, using comparable tools, 
 * checking if the contact is valid to enter (checking for last name is not left blank)
 * and compare to methods.
 */

import java.io.PrintStream;  
import java.util.Scanner;

public class ContactRepository implements Comparable <ContactRepository> {

	
	/**************************** readContact *********************************
	 * Reads a contact from the prompt strings using all the private variables. 
	 **************************************************************************/
	public void readContact(PrintStream output, Scanner input) {

	}
	
	/******************************* toString *************************************************
	 * Returns a string to display the contact when we would like to print individual contacts. 
	 *****************************************************************************************/
	public String toString() {
		
		return "Return a string to display contact if found to print or display";
	}

	/************************************ contactVerification *****************************
	 * Checks that the user entered last name or left it blank. If it is left blank, 
	 * then the user contact is not saved and a message will be generated to inform the user. 
	 *************************************************************************************/
	public boolean contactVerification() {

		return true;
	}
	
	/**************************** searchByLastName **********************************
	 * Searches by last name and returns that contact.
	 * This will be used for sorting and finding by last name.
	 *******************************************************************************/
	public String searchByLastName() {

		return "Get last name contact and return that contact if found!";
	}
	
	/**************************** compareTo *******************************
	 * Compares two contacts with each other, and organizes contacts into
	 * alphabetical order.
	 *********************************************************************/
	public int compareTo(ContactRepository comparison) {
		
		return 11;
	}
	
}

