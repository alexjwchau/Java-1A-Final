
/** One object of this class represents the user's street address information.
 * */

public class StreetAddress {

	private String streetNumber;		// private data member for streetNumber
	private String streetName;			// private data member for streetName
	private String city;				// private data member for city
	private String state;				// private data member for state
	private String zip;					// private data member for zip
	private String country;				// private data member for country

	// Constructor with string parameters
	StreetAddress(String streetNumber, String streetName, String city, String state, String zip, String country) { 
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

//	public String getStreetNumber() {
//		return streetNumber;			// returns value of streetNumber
//	}
//
//	public void setStreetNumber(String streetNumber) {
//		this.streetNumber = streetNumber;		// references streetNumber
//	}
//
//	public String getStreetName() {
//		return streetName;			// returns value of streetName
//	}
//
//	public void setStreetName(String streetName) {
//		this.streetName = streetName;			// references streetName
//	}
//
//	public String getCity() {
//		return city;			// returns value of city
//	}
//
//	public void setCity(String city) {
//		this.city = city;			// references city
//	}
//
//	public String getState() {
//		return state;			// returns value of
//	}
//
//	public void setState(String state) {
//		this.state = state;			// references state
//	}
//
//	public String getZip() {
//		return zip;			// returns value of zip
//	}
//
//	public void setZip(String zip) {
//		this.zip = zip;			// references zip
//	}
//
//	public String getCountry() {
//		return country;			// returns value of country
//	}
//
//	public void setCountry(String country) {
//		this.country = country;			// references country
//	}

}
