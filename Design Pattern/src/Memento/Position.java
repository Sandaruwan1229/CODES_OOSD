package Memento;


public class Position {
	private int position_x;
	private int position_y;
	
	public Position(int x, int y){
		this.position_x = x;
		this.position_y = y;
	}
	
	public int getPosition_x() {
		return this.position_x;
	}
	
	public int getPosition_y() {
		return this.position_y;
	}
}
