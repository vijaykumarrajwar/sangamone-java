	class MyThead1 extends Thead{
		@Override
		public void run() {
			int i=0;
			
			while(i<=899) {
				System.out.println("my thead is happy");
				i++;
			}
		}
	}
	class Myhead2 extends Thead{
		@Override
		public void run() {
			int i=0;
			
			while(i<=899) {
				System.out.println("my thead is happy");
				i++;
			}
		}
	}

	public class Multitheading {
	public static void main(String[] args) {
		MyThead1 t1=new MyThead1();
		Myhead2 t2=new Myhead2();
		t1.start();
		t2.start();
	}
	}
