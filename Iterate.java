package assignment2.com;

import java.util.HashSet;
import java.util.Iterator;

public class Iterate {
	
	  public static void main(String[] args) {
	         // Create a empty hash set
	     HashSet<String> set = new HashSet<String>();
	   // use add() method to add values in the hash set
	          set.add("Agra");						
	          set.add("Nashik");
	          set.add("Rajkot");
	         set.add("Meerut");
	          set.add("Dhanbad");
	          set.add("Ranchi");

	  // set Iterator 
	    Iterator<String> p = set.iterator();
	  // Iterate the hash set
	   while (p.hasNext()) {
	   System.out.println(p.next());
	   }
	   }
	}


