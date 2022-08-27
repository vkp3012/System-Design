package CodeForCommands.solution;

public class StereoOnCommand extends Commands{
	
	Stereo stereo;
	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	@Override
	void execute() {
		// TODO Auto-generated method stub
		stereo.on();
		
	}

	@Override
	void undo() {
		// TODO Auto-generated method stub
		stereo.off();
	}
	
}
