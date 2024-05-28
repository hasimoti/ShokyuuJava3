
public class Tree {
	int x,y,vx,vy;
	public Tree(int x,int y,int vx,int vy) 
	{
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) 
	{
		frame.fillOval(x+10,y+25,20,20);
		frame.fillOval(x+50,y+25,20,20);
		frame.fillRect(x,y,80,30);
		frame.fillRect(x+15,y-20,50,30);
	}
	
	public void move()
	{
		x+=vx;
		y+=vy;
	}
}
