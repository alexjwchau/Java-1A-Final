
/**
 * This Class Includes add contact method, printing method and saving method and loading method.  
 */

import java.io.*;  
import java.util.*;

public class ContactList implements java.io.Serializable { 			//This is used during deserialization to verify 
																	// that the sender and receiver of a serialized 
																	// object have loaded classes for that object

	
	private ArrayList<ContactInfo> myContactList = new ArrayList<ContactInfo>();		// We used Array list because it 
																						// automatically adjusts its size 
																						// and can serialized to disk.
 
	/**************************** addContact *****************************
	 * Adds a new contact to the Arraylist.
	 *********************************************************************/
	public void addContact(ContactInfo newPerson) {

		ContactInfo contactInformation = new ContactInfo(null, null, null, null, null, null, null, null, null, null, null);	
	}
		

	/******************************* printContactList ***********************************
	 * Before printing the contact, first we have to sort it alphabetically by last name.
	 * We can then iterate through the sorted list and print out using the toString 
	 * method on each contact.
	 ***********************************************************************************/
	public String toString() {
		return "Test toString in ContactList";
	}

	/**************************** printContact ********************************
	 * If the last name is searched using the loop and if the contact is found, 
	 * it is going to print out the contact using the toString method.
	 *************************************************************************/
	public void getContact(PrintStream out, String name) {

	}
	
	/**************************** saveContact ***********************************
	 * Saves contacts from program to disk. Using the serialization capabilities
	 * of our Contact object use the java classes above, primarily File, 
	 * FileOutputStream, ObjectOutputStream and IOException.
	 ***************************************************************************/
	public boolean savecontact(String filename) {
		return true;
		
	}
	
	/************************************* loadContact **************************************
	 * Loads contacts from disk to launch program using the serialization capabilities 
	 * of our Contact object using the java classes above, primarily File, ObjectInputStream, 
	 * FileInputStream, IOException, and FileNotFoundException. This should return false 
	 * if the file is loaded successfully, otherwise it should return false.
	 **************************************************************************************/
	public boolean loadcontact(String filename) {
		return true;
	}

}
