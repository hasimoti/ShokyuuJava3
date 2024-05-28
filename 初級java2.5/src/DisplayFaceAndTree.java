
public class DisplayFaceAndTree extends MyFrame{
	public void run() {
		//Face face1=new Face(50,50,10,5);
		Tree tree1=new Tree(50,100,+10,0);
		Tree tree2=new Tree(300,300,-10,0);
		for(int i=0;i<30;i++) 
		{
			clear();
			//face1.draw(this);
			tree1.draw(this);
			tree2.draw(this);
			//face1.move();
			tree1.move();
			tree2.move();
			sleep(0.1);
		}
	}
}
