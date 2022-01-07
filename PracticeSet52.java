class Circle{
	public int radius;
	Circle(int a) {
		this.radius=a;
		// TODO Auto-generated constructor stub
		System.out.println("i am ");
	}
	public double area(){
	return Math.PI*this.radius*radius;
}
}
class Cylinder extends Circle{
	public int height;
	Cyclinder(int r,int h) {
		// TODO Auto-generated method stub;
		super(r);
		this.height=h;
		return;
		
	}
			
	public double volume() {
		return 2*3.14*this.height*radius*radius;
	}
	
}
public class PracticeSet52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle ci =new Circle(12);
		ci.area();
		Cylinder cylinder=new Cylinder();
		cylinder.volume();
		System.out.println(cylinder.volume());
		System.out.println(ci.area());
	}

}
