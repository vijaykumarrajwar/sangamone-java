 interface myCamera{
	 void TakeSnape(); //methode
	 void recordVido();
 }
 interface wifi{
	 String [] getNetwork();
	 void connectToNetwork(String network);
 }
 class myCellPhone{
	 void callNumber(int number) {
		 System.out.println("calling"+number);
	 }
	 void pickCall(int phoneNumber){
		 System.out.println("connecting"+ phoneNumber);
	 }
	
 }
 
 class MySmartPhone extends myCellPhone implements myCamera, wifi{
	public void takeSnape() {
		 System.out.println("taking snap");
	 }
	 
 }
public class DefaultMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySmartPhone ms=new MySmartPhone();
		ms.callNumber(111);
		
	}

}
