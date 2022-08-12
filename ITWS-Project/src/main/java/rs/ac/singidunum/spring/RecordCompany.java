package rs.ac.singidunum.spring;

public class RecordCompany {
	
	private String label_name;
	
	private Address address;

	public RecordCompany(String label_name) {
		super();
		this.label_name = label_name;
	}
	
	public void setAddress(Address address) {
		this.address=address;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(label_name);
		sb.append(". "+ address);
		sb.append("\n");
		return sb.toString();
		
	}
	
	

}
