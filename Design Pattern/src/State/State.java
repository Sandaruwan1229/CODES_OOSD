package State;

public abstract class State {
	abstract public void goNextState(Chain chain);
	abstract public void execute();
}
