package State;

public class Fast extends State {
	private State state;
	
	public Fast() {
		this.state = new Slow();
	}
	public void goNextState(Chain chain) {
		chain.setSate(state);
	}
	
	public void execute() {
		System.out.println("Fan is running fast level");
	}
}
