
public class VarArgs {
//	static int sum(int a,int b) {
//		return a+b;
//	}
//	static int sum(int a1,int b1,int c1) {
//		return a1+b1 +c1;
//	}
static int sum( int x ,int...arr){
	int result=0;
	for(int a:arr) {
		result+=a;
		
	}
	return result;

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the sum of 1 and 2 is: " +sum(2));
		System.out.println("the sum of 1 ,2and 3is: "+sum(1, 2,3,4));
		System.out.println("the sum of 1 ,2and 3is: "+sum(1, 2,3,4,5));
		System.out.println("the sum of 1 ,2and 3is: "+sum(1, 2,3,4,5,6));
		System.out.println("the sum of 1 ,2and 3is: "+sum(1, 2,3,4,5,6,7,8));
	}

}
