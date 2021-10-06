package suraj_pkg;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class TennisCoach implements Coach {
	//FieldInjection directly injecting service with help of spring container
	@Autowired
	//Qualifier Help in selecting specific bean id of service
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;
	/*@Autowired
	 ConstructorInjection for service Injection here
	public TennisCoach(FortuneService theFortune) {
		fortuneService=theFortune;
	}*/
	public TennisCoach() {
		System.out.println("Inside default Constructor");
	}
	//init code 
	@PostConstruct
	public void doStart()
	{
		System.out.println("init works");
	}
	@Override
	public String getDailyWork() {
		return "practise work out hand Tennis";
	}

	@Override
	public String getHelp() {
		
		return fortuneService.getHelp();
	}
	//SetterInjection for service Injection here
	/*@Autowired
	public void setFortuneService(FortuneService thefortuneService) {
		fortuneService=thefortuneService;
	}*/
	//destroy code
	@PreDestroy
	public void doClean()
	{
		System.out.println("destroy works");
	}
	
}
