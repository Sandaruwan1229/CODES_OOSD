package State;

public class Fast extends State {
	// there should not exist State object as pre-define. State pattern hasn't self-association object
	public void goNextState(Chain chain) {
		chain.setSate(new Slow());
	}
	
	public void execute() {
		System.out.println("Fan is running fast level");
	}
}
