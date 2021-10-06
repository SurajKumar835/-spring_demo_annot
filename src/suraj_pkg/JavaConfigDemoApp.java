package suraj_pkg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//using Java Code for configuration file not xml applicationContext.xml file 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach a=context.getBean("swimCoach",SwimCoach.class);
		SwimCoach b=context.getBean("swimCoach",SwimCoach.class);
		boolean check=(a==b);
		System.out.println(check);
		System.out.println(a.getHelp());
		System.out.println(a.getDailyWork());
		System.out.println(a.getEmail());
		System.out.println(a.getPlay());
		System.out.println("Memory location of a " +a);
		System.out.println("Memmory location of b " +b);
		context.close();

	}

}
