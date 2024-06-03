import java.util.Vector;

public class fivecar extends MyFrame
{
	public void run()
	{
		Vector<car> cars=new Vector<car>();
		cars.add(new car(10,10,10,0));
		cars.add(new car(10,70,11,0));
		cars.add(new car(10,130,12,0));
		cars.add(new car(10,190,13,0));
		cars.add(new car(10,250,14,0));
		for(int i=0;i<30;i++) 
		{
			clear();
			for(int j=0;j<cars.size();j++)
			{
				cars.get(j).draw(this);
				cars.get(j).move();
			}
			sleep(0.1);
		}
	}

}
