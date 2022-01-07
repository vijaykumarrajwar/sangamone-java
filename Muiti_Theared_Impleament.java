class MyThreadRunnable1 implements Runnable{
	public void run () {
		System.out.println("Iam raunble1");
	}
}
 class MyThreadRunnable2 implements Runnable{
	 public void  run() {
		 System.out.println("I am runnble 3333");
		
	}
 }
public class Muiti_Theared_Impleament {
	MyThreadRunnable1 bullet=new MyThreadRunnable1();
	Thead gun1=new Thead(bullet);
	MyThreadRunnable2 bullet2=new MyThreadRunnable2();
	Thead gun2=new Thead(bullet2);
	gun1.start();
	gun2.start();

}
