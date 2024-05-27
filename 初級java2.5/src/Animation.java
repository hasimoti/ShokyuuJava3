
public class Animation extends MyFrame
{
	public void run()
	 {
		int x =30;
		int y=100;
		int i=0;
		while(i!=3) 
		{
			while(x<=250)
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
			i+=1;
		}
		
		
		
		
	 }

}
