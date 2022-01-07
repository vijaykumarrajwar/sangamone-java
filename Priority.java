
public class Priority extends Thread {
	public Priority(String name) {
		super(name);
	}
	public void run() {
		int i= 10;
		 while (true) {
			 System.out.println("Thank you "+ this.getName());
		 }
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Priority t1= new Priority("vijay1");
        Priority t2= new Priority("vijay13");
		Priority t3= new Priority("vijay31");
		Priority t4= new Priority("vijay41");
	  	Priority t5= new Priority("vijay51");
	  	t5.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		t4.setPriority(Thread.MAX_PRIORITY);
		t5.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		

	}

}
