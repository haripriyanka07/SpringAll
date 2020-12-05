package springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		//load the spring file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Scope-applicationContext.xml");
		
		//retrieve bean 
		Language lang = context.getBean("myLanguage", Language.class);
		
		Language lang2 = context.getBean("myLanguage", Language.class);
		
		//check
		boolean result = (lang == lang2);
		
		//print
		System.out.println(result);
		
		//memory location
		System.out.println("LAnguage " + lang);
		System.out.println("LAnguage 2 " + lang2);
		
		//close
		context.close();
		
	}

}
