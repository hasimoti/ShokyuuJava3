
public class Animation extends MyFrame
{
	public void run()
	 {
		int x =30;
		int y=200;
		/*while(true)
		{
		 while(x<=170)
		 {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			sleep(0.1);
		 }
		   while(x>=30)
	      {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x-=5;
			sleep(0.1);
		   }
		   
		}
		*/
		while(y>=100)
		{
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			y-=5;
			sleep(0.1);
		}
		while(x<=170) 
		{
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			sleep(0.1);
		}
	 }

}
