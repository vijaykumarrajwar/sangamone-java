import java.util.Scanner;
class MyExeptionn extends Exeption{
	public String toString() {
			// TODO Auto-generated method stub
			return "I am toString";
		}
	 public String getMessage() {
		// TODO Auto-generated method stub
		 return "I am getMesage";
	}
 }
public class Exceptione {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			a=sc.nextInt();
			if(a<9) {
				try {
					throw new Exception();
					
				} catch (Exception e) {
					// TODO: handle exception
	
				System.out.println(e.getMessage());

				System.out.println(e.toString());
				e.printStackTrace();
				System.out.println("Finied");
			}
				System.out.println("yes4");
	}
			
		}
}
