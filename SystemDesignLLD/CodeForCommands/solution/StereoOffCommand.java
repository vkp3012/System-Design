package CodeForCommands.solution;

public class StereoOffCommand extends Commands{
	
	Stereo stereo;
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	void execute() {
		// TODO Auto-generated method stub
		stereo.off();
	}

	@Override
	void undo() {
		// TODO Auto-generated method stub
		stereo.on();
	}
	
	
}
