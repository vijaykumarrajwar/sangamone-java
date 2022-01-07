	class NeagtiveExeption extends Exeption{
		@Override 
		public String toString() {
			// TODO Auto-generated method stub
			return "radius can not be negative";
		}
		@Override
	 public String getMessage() {
		// TODO Auto-generated method stub
		 return "radius can not be negative";
	}

 }
public class Throw_Thrown {
	
	public static double area(int r)throws NeagtiveExeption {
		if(r<0){
			throw new  NeagtiveExeption();
		}
		double result= Math.PI *r*r;
	return     result;
	}

public 	static int divide (int a , int b) throws ArithmeticException{
		
		int result =a/b;
		return result;
	}
	
	public static void main(String[] args) {
///*//		
		try {
		
//			int c =divide(6,0);
//			System.out.println(c);
			double ar = area(6);
			System.out.println(ar);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ArithmeticExceptionnnn error");
		
	}
}
}
