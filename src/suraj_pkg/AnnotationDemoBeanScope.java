package suraj_pkg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoBeanScope {

	public static void main(String[] args) {
		
		//scope singleton and prototype
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach a=context.getBean("tennisCoach",Coach.class);
		Coach b=context.getBean("tennisCoach",Coach.class);
		boolean check=(a==b);
		System.out.println(check);
		System.out.println("Memory location of a " +a);
		System.out.println("Memmory location of b " +b);
		context.close();

	}

}
