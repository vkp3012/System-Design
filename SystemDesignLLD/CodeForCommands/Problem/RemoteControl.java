package CodeForCommands.Problem;

public class RemoteControl {
		Light light = new Light();
		
		void btn1click() {
			light.on();
		}
		
		void btn2click() {
				light.off();	
		}
		
		void btn3click() {
			System.out.println("No functionality");
		}
		
		void btn4click() {
			System.out.println("No functionality");
		}
}
