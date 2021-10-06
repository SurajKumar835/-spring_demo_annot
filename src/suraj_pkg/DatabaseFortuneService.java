package suraj_pkg;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
	private String[] data= {
			"Luck Work when u work hard",
			"ALways Work Hard ! for luck",
			"Come on man WOrk harder than yestreday for more lucky today"
		};
		private Random myRandom=new Random();
	@Override
	public String getHelp() {
		//nextInt gives from sequence of index to give random index
		String fortuneCard=data[myRandom.nextInt(data.length)]; 
		return fortuneCard;
	}

}
