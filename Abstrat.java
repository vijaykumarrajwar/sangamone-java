	abstract class Base2{
		 public Base2() {
			 System.out.println("maai base2 ka constructor hoo");
		 }
		 public void sayHello() {
			System.out.println("hello");
		}
		 abstract public void greet();
		 
	 }
	 class Drive2 extends Base2{
		 @Override
		 public void greet() {
			System.out.println("good morning");
		}
		 
	 }
public class Abstrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drive2 drive2=new Drive2();
		drive2.sayHello();
		drive2.greet();
		
	}

}
