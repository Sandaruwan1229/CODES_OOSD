package Memento;




public class Flag {
	private int position_x;
	private int position_y;
	
	public Flag(int x, int y){
		this.position_x = x;
		this.position_y = y;
	}
	public void setPositionx(int x){
		this.position_x = x;
	}
	public void setPositiony(int y){
		this.position_y = y;
	}
	public int getPositionx(){
		return position_x;
	}
	public int getPositiony(){
		return this.position_y;
	}
	
	
	
	public Position savePosition() {
		return new Position(this.position_x,this.position_y);
	}
	
	public void setPosition(Position position) {
		this.position_x = position.getPosition_x();
		this.position_y = position.getPosition_y();
	}
}


