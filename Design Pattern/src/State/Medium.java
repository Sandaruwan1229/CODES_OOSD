package State;

public class Medium extends State {
	private State state;
	
	public Medium() {
		this.state = new Fast();
	}
	public void goNextState(Chain chain) {
		chain.setSate(state);
	}
	
	public void execute() {
		System.out.println("Fan is running medium level");
	}
}
