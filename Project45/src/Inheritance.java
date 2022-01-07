class Base{
	int x;
	
 public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

public void PrintMe(){
		System.out.println("Iam constructor");
	}
}
 class Drive extends Base{
	public int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	 
 }
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1=new Base();
		b1.setX(4);
		System.out.println(b1.getX());
		Drive D1=new Drive();
		D1.setY(4);
		System.out.println(D1.getY());

	}

}
