
public class car {
	int x,y,vx,vy;
	
	public car(int x,int y,int vx,int vy) 
	{
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) 
	{
		
		frame.fillOval(x+5,y+65,20,20);
		frame.fillOval(x+40,y+65,20,20);
		frame.fillRect(x,y+50,70,20);
		frame.fillRect(x+15,y+30,40,40);
	}
	
	public void move()
	{
		x+=vx;
		y+=vy;
	}
}
