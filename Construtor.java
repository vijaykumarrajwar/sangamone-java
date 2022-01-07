class MyThr extends Thread{
	public MyThr(String name) {
		super(name);
	}
	public void run() {
//		int i=34;
		System.out.println("Thank you");
		
	}
}
public class Construtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThr t1= new MyThr("harry");
		MyThr t2=new MyThr("kumar");
		t1.start();
		System.out.println("The id of the thread t is " +t1.getId());
		System.out.println("The name of the thread t is "+ t1.getName());
		System.out.println("The id of the thread t is " +t2.getId());
		System.out.println("The name of the thread t is "+ t2.getName());
		

	}

}
