package State;

public class Chain {
	private State current;
	
	public Chain(State state) {
		this.current = state;
	}
	
	public void setSate(State state) {
		this.current = state;
	}
	
	public void goNextState() {
		current.goNextState(this);
	}
	
	public void start() {
		while(true) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				//do nothing
			}
			current.execute();
		}
	}
}
