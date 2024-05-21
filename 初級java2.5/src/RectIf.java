
public class RectIf extends MyFrame{
	public void run() {
		int x=300;
		int y=30;
		setColor(0,255,0);
		/*for(int i=0;i<9;i++)//追加1
		{
            fillRect(x,x,y,y);
            x=x+y;
			y=y+5;
		}*/
	
	for(int i=0;i<9;i++)
	{
	       fillRect(x,30,20,y);
	       fillRect(x,30,20,y); 
	    x-=30;
	    y+=20;
	       System.out.println(x);
	}

	}}
