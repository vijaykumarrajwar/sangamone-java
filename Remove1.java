package assignment2.com;

import java.util.HashSet;

public class Remove1 {
	
	  public static void main(String[] args) {
	         // Create a empty hash set
	     HashSet<String> set = new HashSet();
	   // use add() method to add values in the hash set
	          set.add("Red");
	          set.add("Green");
	          set.add("Black");
	          set.add("White");
	          set.add("Pink");
	          set.add("Yellow");
	    System.out.println("Original Hash Set: " + set);
	    System.out.println("Checking  list is empty or not! "+set.isEmpty());
	   //Remove all element
	    set.removeAll(set);
	    System.out.println("Hash Set after removing all the elements "+set);   
	   }
	}


