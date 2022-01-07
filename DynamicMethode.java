

class phone{
    public void greete() {
		System.out.println("my name");
	}	
    public void name() {
    	System.out.println("my name is java");
    	
      }	

    class smartphone extends phone{
	  @Override
	   public void name() {
		System.out.println("my name is java in class two");
	}
  }
  
}
public class DynamicMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 phone obj= new smartphone();
//		 smartphone sma=new  smartphone(); 
		 
		obj.greete();
		obj.name();
		
	}

}
