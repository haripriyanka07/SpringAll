package springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle-applicationContext.xml");
		
		Language lang = context.getBean("myLanguage", Language.class);
		
		lang.language();
		
		context.close();
	}

}
