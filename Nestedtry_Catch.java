import java.util.Scanner;


public class Nestedtry_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks= new int[3];
		marks[0]=4;
		marks[1]=33;
		marks[2]=44;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int a =sc.nextInt();
		try {
			System.out.println("Welcome to value 82");
			try {
				System.out.println(marks[a]);
				
			}catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exeptione in level 1");
		}
		System.out.println("thank you");
	}
	
}

