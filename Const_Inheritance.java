
class Base1{
	Base1(){
		System.out.println("I am contructor");
	}
	Base1(int a){
		System.out.println("I am overlodedcontructor value is "+a);
	}
	 class Dred1 extends Base1{
		 Dred1() {
		System.out.println("I am derive construtor");
		}
	}
}
public class Const_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Base1 b1=new Base1();
	       Dred1 d1= new Dred1();
  
	}

}
