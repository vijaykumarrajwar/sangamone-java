package assignment2.com;

import java.util.ArrayList;
import java.util.List;

public class Remove {

	  public static void main(String[] args) {
	  // Creae a list and add some animal to the list
	  List<String> list_Strings = new ArrayList<String>();
	  list_Strings.add("Lion");
	  list_Strings.add("Tiger");
	  list_Strings.add("Whale");
	  list_Strings.add("Snake");
	  list_Strings.add("Bear");
	  // Print the list
	  System.out.println(list_Strings);
	  // Remove the third element from the list.
	  list_Strings.remove(3);
	  // Print the list again
	  System.out.println("After removing third element from the list:\n"+list_Strings);
	 }
	}


