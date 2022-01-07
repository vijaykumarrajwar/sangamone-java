 class MyEmloyee{
	private  int id;
	 private String name;
	 public String getName() {
		 return name;
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
 
 
public class AccesModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEmloyee cc=new MyEmloyee();
//		cc.id=122;
//		cc.name="viajt";
		
		cc.setName("vijay");
		System.out.println(cc.getName());
		cc.setId(11);
		System.out.println(cc.getId());
		
		
	}

}
