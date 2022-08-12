package rs.ac.singidunum.spring;


public class RecordStore {
	
	private String store_name;

	
	private Album album; //object dependency
	private Employee employee;
	private Partner partner;
	private Owner owner;
	
	
	//constructor injection
	
	public RecordStore(String store_name) {
		super();
		this.store_name = store_name;
	}
	
	// setter injection
	
		public void setAlbum(Album album) {
			this.album=album;
		}
		
		public void setEmployee(Employee employee) {
			this.employee=employee;
		}
		public void setPartners(Partner partner) {
			this.partner=partner;
		}
		public void setOwner(Owner owner) {
			this.owner=owner;
		}




	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Hello!"
				+ " You are currently viewing the information about ");
		sb.append(store_name);
		sb.append(". \n");
		
		sb.append("These are just a handfull out of the many records"
				+ " that we offer in our store: \n\n" + album +"\n" );
		
		sb.append("Now, as much as we take pride in the records we sell,"
				+ " we also take pride in our beloved employees.\n\n ");
		sb.append("The employees of this month are: \n" + employee + "\n\n" );
		
		
		
		sb.append("Of course, we must also add that the operation of the Vinyland"
				+ " would not be possible without are trusted partners:\n" + partner +"\n");
		
		sb.append("Many thanks to everyone above mentioned "
				+ "because without them the Vinyland wouldn't be what it is today.\n\n");
		sb.append("Yours truly, \n" + owner+ ". :) ");
		
		return sb.toString();
	}
	
	

}
