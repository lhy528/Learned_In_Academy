package answer;

import org.springframework.beans.factory.annotation.Autowired;

public class SystemMonitor implements Monitor {


	Sender sender;
	
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	
	@Override
	public void showMonitor() {
		if(sender != null) sender.show();
		else System.out.println("sender is null");

	}

}
