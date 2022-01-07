class Cylinder{
	private int radius;
	 private int height;
	public int getRadius() {
		return radius;
	}
	public Cylinder( int radius,int height) {
		this.radius=radius;
		this.height=height;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	 
	public double surfaceArea() {
		return 2*3.14*radius*radius+2*Math.PI*radius*height;
	}
		public double volume(){
			return Math.PI*radius*radius*height;
		
	} 
}

public class Practiceset9 {

	public static void main(String[] args) {
		// TODO Auto-generated method sub
		/*
		Cylinder cylinder= new Cylinder();
		cylinder.setHeight(12);
		int h=cylinder.getHeight();
		System.out.println(h);
		cylinder.setRadius(23);
		int r=cylinder.getRadius();
		System.out.println(r);
		*/
//		problem2
		Cylinder cylinder= new Cylinder(9,12);
//		cylinder.setHeight(12);
//		int h=cylinder.getHeight();
//		System.out.println(h);
//		cylinder.setRadius(23);
//		int r=cylinder.getRadius();
//		System.out.println(r);
        System.out.println(cylinder.surfaceArea());
        System.out.println(cylinder.volume());
		}
	}
