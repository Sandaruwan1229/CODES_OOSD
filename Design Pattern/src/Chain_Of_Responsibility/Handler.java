package Chain_Of_Responsibility;

public abstract class Handler {
	private Handler succesor;
	
	public void setSuccesor(Handler handler) {
		this.succesor = handler;                                 // self-association done by setSuccesor method														
	}                                                            // it can't to do by each constructor
	abstract public boolean checkRequest(Request request);       // Because last handler hasn't succesor
	
	abstract public void executeRequest(Request request);
	
	public void handleRequest(Request request) {
		if(succesor != null || !checkRequest(request)) {
			succesor.handleRequest(request);
		}
		else {
			executeRequest(request);
		}
	}
}
