package CodeForCommands.solution;

public class StereoIncVolumeCommand extends Commands {
	Stereo stereo;
	public StereoIncVolumeCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	@Override
	void execute() {
		// TODO Auto-generated method stub
		stereo.incVolume(1);
	}
	@Override
	void undo() {
		// TODO Auto-generated method stub
		stereo.decVolume(-1);
	}
}
