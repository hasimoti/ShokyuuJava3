
public class Truck extends Vehicle{
	public Truck(int x, int y,int vx,int vy) {
		super(x,y,vx,vy);
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x+50,y,30,20);
		frame.fillRect(x,y+20,80,20);
		frame.fillOval(x+13,y+38,12,12);
		frame.fillOval(x+0,y+38,12,12);
		frame.fillOval(x+60,y+38,12,12);
	}

}
