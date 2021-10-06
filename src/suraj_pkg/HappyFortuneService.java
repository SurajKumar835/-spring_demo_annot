package suraj_pkg;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getHelp() {
		return "What help u need?";
	}

}
