package CodeForCommands.solution;

public class Stereo {
	private int volume = 5;
	
	void on() {
		System.out.println("Turn On the stereo");
	}
	
	void off() {
		System.out.println("Turn off the stereo");
	}
	
	void incVolume(int delta) {
		volume += delta;
		System.out.println("Increase Volume" + volume);
	}
	
	void decVolume(int delta) {
		volume -= delta;
		System.out.println("Descrese Volume" + volume);
	}
}
