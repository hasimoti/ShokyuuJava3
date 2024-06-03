import java.util.Vector;

public class DisplayfaceVector extends MyFrame{

	
	public void run()
	{
		Vector<Face> faces=new Vector<Face>();
		faces.add(new Face(50,50,10,0));
		faces.add(new Face(50,100,10,0));
		
		for(int i=0;i<30;i++) 
		{
			clear();
			for(int j=0;j<faces.size();j++)
			{
				faces.get(j).draw(this);
				faces.get(j).move();
			}
			sleep(0.1);
		}
	}
}
