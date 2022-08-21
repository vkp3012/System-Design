package CodeForStateDesignPattern.Solution;

public class StandByState extends AudioPlayerState {

	@Override
	public void pressPlay(AudioPlayer p1) {
		// TODO Auto-generated method stub
		System.out.println("Invaild Opertion");
		
	}

	@Override
	public void pressChangeSource(AudioPlayer p1) {
		// TODO Auto-generated method stub
		System.out.println("Setting source to radio");
		p1.state = new RadioState();
	}
	
}
