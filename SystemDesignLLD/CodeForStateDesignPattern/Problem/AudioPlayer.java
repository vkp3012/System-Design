package CodeForStateDesignPattern.Problem;

public class AudioPlayer {
	String state;
	
	public AudioPlayer() {
		this.state = "standBy";
	}
	
	
	public void pressPlay() {
		if(this.state.equals("standBy")) {
			System.out.println("Invaild operation");
		}else if(this.state.equals("mp3playing")) {
			System.out.println("Paused mp3");
			this.state = "mp3paused";
		}else if(this.state.equals("mp3paused")) {
			System.out.println("Playing mp3");
			this.state = "mp3playing";
		}else if(this.state.equals("radio")) {
			System.out.println("Changing station");
		}
	}
	
	public void pressChangeSource() {
		if(this.state.equals("standBy")) {
			System.out.println("Setting source to radio");
			this.state = "radio";
		}else if(this.state.equals("mp3playing")) {
			System.out.println("Setting source to radio");
			this.state = "radio";
		}else if(this.state.equals("mp3paused")) {
			System.out.println("Setting source to radio");
			this.state = "radio";
		}else if(this.state.equals("radio")) {
			System.out.println("Setting source to mp3");
			this.state = "mp3paused";
		}
	}
}
