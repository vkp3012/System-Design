package CodeForStateDesignPattern.Solution;

public class Mp3PausedState extends AudioPlayerState {
	
	public void pressPlay(AudioPlayer p1) {
		// TODO Auto-generated method stub
		System.out.println("Playing MP3");
		p1.state = new Mp3PlayingState();
	}

	@Override
	public void pressChangeSource(AudioPlayer p1) {
		// TODO Auto-generated method stub
		System.out.println("Setting source to radio");
		p1.state = new RadioState();
	}
}
