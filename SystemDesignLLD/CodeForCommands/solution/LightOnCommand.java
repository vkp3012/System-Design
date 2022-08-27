package CodeForCommands.solution;

public class LightOnCommand extends Commands {
	
	Light light;
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	void execute() {
		// TODO Auto-generated method stub
		light.on();
		
	}

	@Override
	void undo() {
		// TODO Auto-generated method stub
		light.off();
	}

}
