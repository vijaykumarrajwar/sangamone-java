import java.lang.Math;
import java.util.Scanner;

public class SameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the nmber: ");
		int a=sc.nextInt();
    int i=0;
    int ans=0;
    while(a!=0) {
    	 int digit=a%10;
    	if (digit==1) {
			ans=ans+(int)Math.pow(2,i);
		
		}
    	i++;
		a=a/10;
    	
    }
    System.out.println(ans);
	}

}
