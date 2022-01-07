interface sampleIntergace{
	void math1();
	void math2();
}
interface childSampleInterface extends sampleIntergace{
	void math3();
	void math4();
}
class MySampleClass implements childSampleInterface{
	public void meth1() {
		System.out.println("meth1");
		}
	public void meth2() {
		System.out.println("meth2");
		}
	public void meth3() {
		System.out.println("meth3");
		}
	public void meth4() {
		System.out.println("meth4");
		}
	public void meth5() {
		System.out.println("meth5");
		}
}
public class Inher_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySampleClass ms= new MySampleClass();
		ms.meth1();
		ms.meth2();
	}

}
