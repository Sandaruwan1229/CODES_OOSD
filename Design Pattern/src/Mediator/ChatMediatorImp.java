package Mediator;

import java.util.ArrayList;

public class ChatMediatorImp implements ChatMediator{

	private ArrayList<User> list;
	
	public ChatMediatorImp() {
		this.list = new ArrayList<User>();
	}
	
	public void send(String msg, User user) {
		for(User u : list) {
			if(u!=user) {
				
			}
		}
	}
	
	public void add(User user) {
		list.add(user);
	}
}
