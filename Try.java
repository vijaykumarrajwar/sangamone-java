
public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=44;
		int c=0;
		try {
			int b=a/c;
			System.out.println(b);
		}  
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("we fail to divide .reason:");
			System.out.println(e);
		}
		System.out.println("End of the program");
	}

}
