package suraj_pkg;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getHelp() {
		
		return "Call RandomFortuneService ! it's your Lucky day";
	}

}
