package rs.ac.singidunum.spring;

public class Owner {
	
	private String owner;

	public Owner(String owner) {
		super();
		this.owner = owner;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(owner);
		return sb.toString();
	}
	
	
	

}
