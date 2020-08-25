package State;

public class Slow extends State {
	private State state;
	
	public Slow() {
		this.state = new Medium();
	}
	public void goNextState(Chain chain) {
		chain.setSate(state);
	}
	
	public void execute() {
		System.out.println("Fan is running slow level");
	}
}
