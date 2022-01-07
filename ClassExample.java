 class Example{
	 int a,b, total;
	 void add() {
	 	 total=a+b;
	 }
 }
public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Example obj=new  Example();
		 obj.a=10;
		 obj.b=20;
		 obj.add();
		 System.out.println("Addtion="+obj.total);
	}

}
