
/** One object of this class represents the contact information of a person 
 * */

public class ContactInfo {

	private String firstName;		// private data member for firstName
	private String lastName;		// private data member for lastName
	private String emailAddress;	// private data member for emailAddress
	private String phoneNumber;		// private data member for phoneNumber
	private String notes;			// private data member for notes

	StreetAddress streetAddress;	// instantiates an object streetAddress

	// Constructor
	ContactInfo(String firstName, String lastName, String streetNumber, String streetName, String city, String state,
			String zip, String country, String emailAddress, String phoneNumber, String notes) {		// parameters for constructor
		this.firstName = firstName;	
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.notes = notes;
		this.streetAddress = new StreetAddress(streetNumber, streetName, city, state, zip, country);
	}
	
	public String getFirstName() {		
		return firstName;				// returns value for firstName 
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;		// references firstName
	}

	public String getLastName() {
		return lastName;				// returns value for lastName
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;		// references lastName
	}

	public String getFullName() {
		return firstName + " " + lastName;		// returns fullName
	}
	
	public String getEmailAddress() {
		return emailAddress;			// returns value for emailAddress
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;		// references emailAddress
	}

	public String getPhoneNumber() {		
		return phoneNumber;			// returns value for phoneNumber
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;			// references phoneNumber
	}

	public String getNotes() {
		return notes;		// returns value for notes
	}

	public void setNotes(String notes) {
		this.notes = notes;			// references notes
	}

	public String getStreetAddressStr() {
		return this.streetAddress.toString();		// returns the contents of class StreetAddress 
	}
	
	public String toString() {
		return "Test toString";
	}
}
