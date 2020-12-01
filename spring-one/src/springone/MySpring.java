package springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container
		//pass an interface and behind the scene spring cast the object.
		Language lang= context.getBean("myLanguage", Language.class);
		
		//call the method on that bean
		lang.language();
		
		// calling new methods
		lang.exec();
		
		//close the context
		context.close();

	}

}
