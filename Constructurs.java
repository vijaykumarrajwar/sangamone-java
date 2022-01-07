     class MyEmloyee{
	private  int id;
	 private String name;
	 public String getName() {
		 return name;
	 }
	 public MyEmloyee(){
		 id=453;
		 name="vijay kumar rajear";
	 }
	 public MyEmloyee(String myName,int myId) {
		 name=myName;
		 id=myId;
	 }
	 
	 public void setName(String n) {
		 name= n;
		 
	 }
	
		public void setId(int i) {
		id=i; 
	 
	}
		 public int getId() {
			 return id; 
		 }
		
	 	    
 }
 
public class Constructurs {

	public static void main(String[] args) {
		// TODO Auto-
		MyEmloyee vk= new MyEmloyee( );
		System.out.println(vk.getId());
		System.out.println(vk.getName());
	}

}
