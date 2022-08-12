package rs.ac.singidunum.spring;

public class BestSeller {
	
	private String best_seller;
	
	private RecordCompany record_company;
	private Song songs;
	private MPSong mpsong;

	
	public BestSeller(String best_seller) {
		super();
		this.best_seller = best_seller;
	}
	

	public MPSong getMpsong() {
		return mpsong;
	}


	public void setMpsong(MPSong mpsong) {
		this.mpsong = mpsong;
	}


	public Song getSongs() {
		return songs;
	}


	public void setSongs(Song songs) {
		this.songs = songs;
	}


	public RecordCompany getRecord_company() {
		return record_company;
	}




	public void setRecord_company(RecordCompany record_company) {
		this.record_company = record_company;
	}



	@Override
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		sb.append(best_seller);
		sb.append(". \n Record Company: "+ record_company);
		sb.append("\n");
		sb.append(" The featured songs are: \n "+ songs);
		
		
		sb.append("\n The most popular song on this album is:  " + mpsong);
		return sb.toString();
		
	}
	
	
	
	

}
