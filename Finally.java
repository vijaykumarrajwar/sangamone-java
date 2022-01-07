
public class Finally {
	public static int greet() {
		try {
			int a=22;
			int b=2;
			int c =a/b;
			return c;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("This is end of this prpgram");
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int k= greet();
		   System.out.println(k);
		   int a=32;
		   int b=8;
		   while(true) {
			   try {
			   System.out.println(a/b);
		   } catch (Exception e) {
			// TODO: handle exception
			   System.out.println(e);
			   break;
		}
			   finally {
				System.out.println("Iam finally");
			}
			   b--;
	}
		   try {
			
		} finally {
			System.out.println("yes ");
		}
	}

}
