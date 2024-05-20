
public class RectLoop extends MyFrame{
	public void run() 
	{
		setColor(0,128,0);
	    int x=10;
		
		while(x!=210) 
		{
			fillRect(x,80,10,100);
			x+=20;
			System.out.println(x);
		}
		
		
		
	}

}
