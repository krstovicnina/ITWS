package rs.ac.singidunum.spring;

import java.util.List;

public class Album {
	
	
	private List <String> name;
	private BestSeller best_seller ; 

	public Album(List<String> name) {
		super();
		this.name = name;
	}
	

	

	public BestSeller getBest_seller() {
		return best_seller;
	}




	public void setBest_seller(BestSeller best_seller) {
		this.best_seller = best_seller;
	}




	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(String name: name) {
			sb.append("				");
			sb.append(name);
			sb.append("\n");
			
		}
		sb.append("\n\n");
		sb.append("Our bestseller is: " + best_seller +"\n\n");
		return sb.toString();
		
	}
	
	
	
	

}
