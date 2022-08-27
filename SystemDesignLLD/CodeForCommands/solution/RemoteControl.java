package CodeForCommands.solution;

public class RemoteControl {
	Commands b1Command;
	Commands b2Command;
	Commands b3Command;
	Commands b4Command;
	
	
	void btn1click() {
		if(b1Command == null) {
			System.out.println("No functionality");
			return ;
		}
		b1Command.execute();
	}
	
	void btn2click() {
		if(b1Command == null) {
			System.out.println("No functionality");
			return ;
		}
		
		b2Command.execute();
			
	}
	
	void btn3click() {
		if(b1Command == null) {
			System.out.println("No functionality");
			return ;
		}
		b3Command.execute();
	}
	
	void btn4click() {
		if(b1Command == null) {
			System.out.println("No functionality");
			return ;
		}
		
		b4Command.execute();
	}
}
