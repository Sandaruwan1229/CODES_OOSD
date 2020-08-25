package Chain_Of_Responsibility;

public class ConcreteHandler1 extends Handler{

	private int id;
	
	public ConcreteHandler1() {
		id = 1;
	}
	public boolean checkRequest(Request request) {
		return id == request.id;
	}
	
	public void executeRequest(Request request) {
		// do something according request
	}
}
