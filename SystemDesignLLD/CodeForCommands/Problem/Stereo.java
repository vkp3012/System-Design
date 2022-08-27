package CodeForCommands.Problem;

public class Stereo {
	private int volume = 5;
	
	void on() {
		System.out.println("Turn on the light");
	}
	
	void off() {
		System.out.println("Turn on the light");
	}
	
	void volumeInc(int delta) {
		volume += delta;
		System.out.println("Volume set to" + volume);
	}
	
	void volumeDec(int delta) {
		volume -= delta;
		System.out.println("Volume set to" + volume);
	}
}
