package rs.ac.singidunum.spring;

import java.util.List;

public class Song {
	
	private List <String> title;

	public Song(List<String> title) {
		super();
		this.title = title;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(String title: title) {
			sb.append("				");
			sb.append(title);
			sb.append("\n");
			
		}
	
		return sb.toString();
	}
	
	

}
