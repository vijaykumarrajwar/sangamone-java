import java.util.Scanner;
public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks= new int[3];
		marks[0]=4;
		marks[1]=33;
		marks[2]=44;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array index");
		int ind =sc.nextInt();
		
		System.out.println("Enter the number you want to divide  the value with");
		int num= sc.nextInt();
	try{
		System.out.println("The value of the array index enter is "+marks[ind]);	
		System.out.println("the value of arrat value divede  "+marks[ind]/num);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception1
			System.out.println("ArithmeticException occurred");
		System.out.println(e);
		}
	catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception1
		System.out.println("(ArrayIndexOutOfBoundsException ");
	System.out.println(e);
	}
	catch (Exception e) {
		// TODO: handle exception1
		System.out.println("ArithmeticException occurred");
	System.out.println(e);
	}
	}
	

}
