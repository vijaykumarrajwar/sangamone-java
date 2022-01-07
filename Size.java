package assignment2.com;

import java.util.HashSet;

public class Size {
	

	  public static void main(String[] args) {
	         // Create a empty hash set
	     HashSet<String> h_set = new HashSet<String>();
	   // use add() method to add values in the hash set
	          h_set.add("Patna");
	          h_set.add("Bokaro");
	          h_set.add("Chas");
	          h_set.add("Tata");
	          h_set.add("kota");
	          h_set.add("Solapur");
	    System.out.println("Original Hash Set: " + h_set);
	    System.out.println("Size of the Hash Set: " + h_set.size());
	   }
	}

