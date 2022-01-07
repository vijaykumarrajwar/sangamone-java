package apnacollage.com;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc =new Scanner(System.in); String name =sc.nextLine();
		 * System.out.println("your name is "+name);
		 */
		 
		 //charAt
			/*
			 * String firstname ="vijay"; String lastname="kumar"; String
			 * fullname=firstname+" @ "+lastname; System.out.println(fullname.length());
			 * for( int i=0;i<fullname.length(); i++)
			 * System.out.println(fullname.charAt(i));
			 */
		//compare
		/*
		 * String name1="vijay"; String name2="viyayy";
		 * 
		 * if(name1.compareTo(name2)==0) { System.out.println("String are equal"); }else
		 * { System.out.println("String are not equals"); }
		 */
		
		//substring
		/*
		 * String name="vijaykuamar"; System.out.println(name.substring(0,5));
		 */
		
		String str="123";
		int number=Integer.parseInt(str);
		System.out.println(number);
		int numbesr=123;
		String s1=Integer.toString(numbesr);
		System.out.println(s1.length());
		
		
}
}