import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int year;
     Scanner sc =new Scanner(System.in);
          System.out.println("enter the Year:");
          year=sc.nextInt();
          if (((year%4==0)&&(year%100!=0))||(year%400==0)) {
        	  System.out.println("leap year");
			}
          else {
			System.out.println("not leap year");
		}
	}

}
