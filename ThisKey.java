import javax.print.Doc;
class EkClass{
	 int a;
	  EkClass(int v) {
		// TODO Auto-generated constructor stub
		 this.a=v; 
	}
	  
	 public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int returnone(){        /* methode*/
		 return 1;
		 class DoClass extends EkClass{
			 public DoClass(int c) {
				// TODO Auto-generated constructor stub
				 super(c);
				 System.out.println("i am construtor");
			}
		 }
	 }
	
 }
public class ThisKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       EkClass e= new EkClass(55);
       Doclass d=new Doclass(4);
       System.out.println(e.getA());
	}

}
