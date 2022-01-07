package assignment2.com;

import java.util.ArrayList;

public class Clone {
	  public static void main(String[] args) {
	          ArrayList<String> s1= new ArrayList<String>();
	          s1.add("Red");
	          s1.add("Green");
	          s1.add("Black");
	          s1.add("White");
	          s1.add("Pink");
	          System.out.println("Original array list: " + s1);
	          ArrayList<String> news1 = (ArrayList<String>)s1.clone();
	          System.out.println("Cloned array list: " + news1);       
	}
	}


