package rs.ac.singidunum.spring;

public class MPSong {
	
	private String mpsong_title;
	
	private Author author;

	public MPSong(String mpsong_title) {
		super();
		this.mpsong_title = mpsong_title;
	}
	
	public void setAuthor(Author author) {
		this.author=author;
	}
	

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(mpsong_title);
		sb.append(". Author: " + author);
		sb.append(". \n");
		return sb.toString();
		
	}
	
	

}
