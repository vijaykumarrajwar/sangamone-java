package assign19;

import java.util.Scanner;

public class TestStringFormatter{  
public static void main(String[] args) { 
	Scanner sc= new Scanner(System.in);
	String s=sc.nextLine();
	String rev="";
	char a[]=s.toCharArray();

	for(int i=a.length-1;i>=0;i--) {
		rev=rev+a[i];
	}
	
System.out.println(rev);   
    }  
}

