class Mythr1 extends Thread{
		public void run() {
			int i=0;
			while (true){
				System.out.println("thank you");
				try {
					
					Thread.sleep(1);
				}
				catch (Exception e) {
					// TODO: handle exception
					
				}
				i++;
			
			}
		}
		
	}
	class Mythr2 extends Thread{
		public void run() {
		 while(true){
			 System.out.println("My thank you");
		 }
	}
	}                            
	                            
	
public class Thread_Methode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythr1 t1=new Mythr1();
		t1.start();
		try {
			t1.join();
			
		} catch (Exception e) {
System.out.println(e);			// TODO: handle exception
		}
	Mythr2 t2=new Mythr2();
	t2.start();
	}


	}
