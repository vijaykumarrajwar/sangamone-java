class a{
	public int a;
	public int harry() {
		return 4;
			}
	public void math2() {
		System.out.println("i am methode 2 of class a");
		
	}
}
 class b extends a{
	 @Override
	
	 public void math2() {
		 System.out.println("i am methoe 2 of class b");
		
	}
	 public void math3() {
		 System.out.println("i am methoe 2 of class c");
		
	}
 }
public class MethodeOverloading {
public static void main(String[] args) {
	a A=new a();
	A.math2();
	b B = new b();
	B.math2();
	B.math3();
	System.out.print("");
}

}
