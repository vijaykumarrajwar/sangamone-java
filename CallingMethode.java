
public class CallingMethode {
	  int logic(int x,int y) {
		int c;
		if(x>y) {
			c=x+y;
		}
		else {
			c=(x+y)*5;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		int c; 
		CallingMethode obj=new CallingMethode();
		c=obj.logic(a,b);
		System.out.println(c);
	}

}
