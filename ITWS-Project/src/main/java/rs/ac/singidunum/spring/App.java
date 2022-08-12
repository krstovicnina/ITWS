package rs.ac.singidunum.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
		RecordStore store =(RecordStore)context.getBean("store");

		System.out.println(store);
		
		((FileSystemXmlApplicationContext)context).close();
	}
}



