import java.lang.Math;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter the number: ");
  int c = sc.nextInt();

   int ans=0;
   int i=0;
 	  
	       while(c!=0) {
	    	   int bit=c%1;
	           bit=c&1;
	        
	    	     ans =(bit*(int)Math.pow(10,i))+ans;
	    	     
	    	     c=c>>1;
	    	    i++;
	    	
	       }
	       System.out.println(ans);
  }
  
	}
	
