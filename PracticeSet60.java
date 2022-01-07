abstract class Pen{
	 abstract void write();
	abstract  void refil();
}
class FoundtainPen extends Pen{
	void write() {
		System.out.println("write");
	}
	void refil()
	{
	
		System.out.println("refil");
}
}
public class PracticeSet60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FoundtainPen fp = new FoundtainPen();
		 fp.write();
		 fp.refil();
	}


}
