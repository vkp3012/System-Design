package CodeForCommands.solution;

public class Test {
	public static void main(String args[]) {
		RemoteControl rc = new RemoteControl();
		Light light = new Light();
		Stereo stereo = new Stereo();
		
		rc.b1Command = new LightOnCommand(light);
		rc.b2Command = new LightOffCommand(light);
		rc.b3Command = new StereoOnCommand(stereo);
		rc.b4Command = new StereoOffCommand(stereo);
		
		// Test
		rc.btn1click();
		rc.btn2click();
		rc.btn3click();
		rc.btn4click();
	}
}
