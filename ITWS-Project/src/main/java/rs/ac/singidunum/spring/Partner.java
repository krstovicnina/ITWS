package rs.ac.singidunum.spring;

import java.util.List;

public class Partner {
	private List <String> partners;

	public Partner(List<String> partners) {
		super();
		this.partners = partners;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("\n");
		for(String partners: partners) {
			sb.append("				");
			sb.append(partners);
			sb.append("\n");
			
		}
		return sb.toString();
	}
	

}


