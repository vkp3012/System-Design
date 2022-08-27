package CodeForCommands.solution;

public class LightOffCommand extends Commands{
	
	Light light;
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	void execute() {
		// TODO Auto-generated method stub
		light.off();
		
	}

	@Override
	void undo() {
		// TODO Auto-generated method stub
		light.on();
	}

}
