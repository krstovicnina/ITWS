package rs.ac.singidunum.spring;

public class Address {
	
	private String street;
	private String postalCode;
	
	

	// constructor injection
	
	public Address(String street, String postalCode) {
		
		this.street = street;
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postalCode=" + postalCode + "]";
	}

}
