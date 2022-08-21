package CodeForStateDesignPattern.Solution;

public class RadioState extends AudioPlayerState {
	
	public void pressPlay(AudioPlayer p1) {
		// TODO Auto-generated method stub
		System.out.println("Changing Station");
		
	}

	@Override
	public void pressChangeSource(AudioPlayer p1) {
		// TODO Auto-generated method stub
		System.out.println("Going to Mp3");
		p1.state = new Mp3PausedState();
	}
}
