package rs.ac.singidunum.spring;

import java.util.List;

public class Employee {
	private List <String> employee;

	public Employee(List<String> employee) {
		super();
		this.employee = employee;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(String employee: employee) {
			sb.append("				");
			sb.append(employee);
			sb.append("\n");
			
		}
		
		return sb.toString();
	}

	
}
