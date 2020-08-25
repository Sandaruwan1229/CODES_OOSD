package State;

public class Slow extends State {
	
	public void goNextState(Chain chain) {
		chain.setSate(new Medium());
	}
	
	public void execute() {
		System.out.println("Fan is running slow level");
	}
}
