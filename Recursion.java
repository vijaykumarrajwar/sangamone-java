
public class Recursion {
	static int factorial(int x) {
		if(x==0||x==1){
			return 1;
			
		}else {
			return x *factorial(x-1);
		}
	}
	static int factorial_iterative(int x) {
		if(x==0||x==1) {
			return 1;
		}
		else {
			int product=1;
			for(int i=0;i<=x;i++) {
				product*=i;
			}
			return product;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int y= 5;
      
       System.out.println(factorial(y));
       System.out.println(factorial_iterative(y));
       
	}

}
