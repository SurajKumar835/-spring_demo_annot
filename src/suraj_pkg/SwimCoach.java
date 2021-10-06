package suraj_pkg;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	//inject value from properties file of swim here using @Value
	@Value("${foo.email}")
	private String email;
	@Value("${foo.play}")
	private String play;
	public SwimCoach(FortuneService thefortuneService)
	{
		fortuneService=thefortuneService;
	}
	@Override
	public String getDailyWork() {
		
		return "swim for 1km";
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return fortuneService.getHelp();
	}
	public String getEmail() {
		return email;
	}
	public String getPlay() {
		return play;
	}
	

}
