package rs.ac.singidunum.spring;

public class Author {
	
	private String author_name;

	

	public Author(String author_name) {
		super();
		this.author_name = author_name;
	}



	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(author_name);
		return sb.toString();
	}
	
	

}
