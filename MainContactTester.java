
/**
 * MainContact contains our main where we instantiate an object of each of our other classes and call methods of these objects.  
 */

import java.io.PrintStream;    
import java.util.Scanner;

public class MainContactTester  {
	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in);			// creates new scanner object		
		PrintStream output = System.out;			// creates output object
		ContactRepository firstContact = new ContactRepository();			// creates new firstContact object
		ContactInfo contactInfo = new ContactInfo(null, null, null, null, null, null, null, null, null, null, null);
		
		firstContact.readContact(output, input); 			// calls readContact method from ContactTools with parameters output and input
		System.out.println(firstContact.toString());		// calls toString method from ContactTools and prints from system
		System.out.println("Testing validContact method: "+ firstContact.contactVerification());		// calls validContact from ContactTools
		System.out.println(firstContact.searchByLastName());		// calls getLastName method from ContactTools
		

		ContactRepository secondContact = new ContactRepository();		// creates new secondContact object
		secondContact.readContact(output,  input);			// calls readContact method from ContactTools with parameters output and input
		System.out.println("Testing compareTo method: "+ firstContact.compareTo(secondContact));		// calls compareTo method from ContactTools and has secondContact as parameter
		System.out.println("Testing equals method: " + firstContact.equals(secondContact));		// calls equals method from ContactTools and has secondContact as parameter

		ContactList list = new ContactList();		// creates new theList object
		list.addContact(contactInfo);			// calls addContact method from ContactList with firstContact as a parameter
		list.toString();		// calls printContactList method from ContactList with output as a parameter
		list.getContact(output, "Chau");		// calls printContactList method from ContactList with output as a parameter
		
		String filename = "ContactList.txt";		// private data member for fileName
		System.out.println("Testing saveList method: " + list.savecontact(filename));		// calls saveList method from ContactList using parameter filename
		System.out.println("Testing loadList method: " + list.loadcontact(filename));		// calls loadList method from ContactList using parameter filename
		
		output.println("Compiled and ran");

	}
	
	
	/********************* finalProgram **********************
	 * Method finalProgram will prompt the user with the 
	 * different use cases, carrying out the inputted task.
	 ******************************************************/
	public static void finalProgram(String [] args) {	
		
		ContactList contactList = new ContactList();
		ContactRepository contactRepository = new ContactRepository();
		
		int caseNumber = 0;
		int taskNumber = 0;
		
		System.out.println("Welcome user.");
		System.out.println("To select a task, please input the corresponding number.");
		System.out.println("[1] Add new contact");
		System.out.println("[2] Print contact list");
		System.out.println("[3] Find contact by last name");
		System.out.println("[4] Exit program");
		
		while(taskNumber!=4) {
			if(taskNumber<1 || taskNumber>4){
				System.out.println("This is not a valid choice.");
				}
					
		}
		
		switch(caseNumber) {
		case 1:
			contactList.addContact(null);
			break;
		case 2:
			
			break;
		case 3:

			break;
		case 4:
			
			break;
		}
		
		
		
		 // create a while loop with a nested if/else statement inside 
		
	}
	
}

/* ****************** copy of console window *********************
Return a string to display contact if found to print or display
Testing validContact method: true
Get last name contact and return that contact if found!
Testing compareTo method: 11
Testing equals method: false
Testing saveList method: true
Testing loadList method: true
Compiled and ran
***************************************************************** */

