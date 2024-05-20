
public class RectLoop extends MyFrame{
	public void run() 
	{
		setColor(0,128,0);
	    int x=30;
		for(int i=0;i<15;i++) 
		{
			fillRect(x,80,10,100);
			System.out.println(x);
			x+=20;
		}
		
	}

}
