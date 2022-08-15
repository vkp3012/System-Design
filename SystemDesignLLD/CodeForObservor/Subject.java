package CodeForObservor;
import java.util.*;

public abstract class Subject {
	private List<Observor> observors;
	
	public Subject() {
		this.observors = new ArrayList<Observor>();
	}
	
	public void register(Observor o) {
		observors.add(o);
	}
	
	public void unregister(Observor o) {
		observors.remove(o);
	}
	
	public void notifyObservor() {
		for(Observor o: observors) {
			o.update(this);
		}
	}
}
