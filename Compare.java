package assignment2.com;

import java.util.HashSet;

public class Compare {

	  public static void main(String[] args) {
	     // Create a empty hash set
	        HashSet<String> set = new HashSet<String>();
	     // use add() method to add values in the hash set
	         set.add("Red");
	         set.add("Green");
	         set.add("Black");
	         set.add("White");

	          HashSet<String> set2 = new HashSet<String>();
	         set2.add("Red");
	         set2.add("Pink");
	         set2.add("Black");
	         set2.add("Orange");
	          //comparison output in hash set
	          HashSet<String>result_set = new HashSet<String>();
	         for (String element : set){
	             System.out.println(set2.contains(element) ? "Yes" : "No");
	          }      
	     }
	}


