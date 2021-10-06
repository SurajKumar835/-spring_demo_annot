package suraj_pkg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach obj=context.getBean("tennisCoach",Coach.class);
		System.out.println(obj.getDailyWork());
		System.out.println(obj.getHelp());
		context.close();
	}

}
