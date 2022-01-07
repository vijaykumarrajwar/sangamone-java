package assignment2.com;

import java.util.ArrayList;
import java.util.List;

public class Retrieve {

	  public static void main(String[] args) {
	  // Creae a list and add some animal to the list
	  List<String> list_Strings = new ArrayList<String>();
	  list_Strings.add("Lion");
	  list_Strings.add("Tiger");
	  list_Strings.add("Shark");
	  list_Strings.add("Whale");
	  list_Strings.add("Bear");
	  // Print the list
	  System.out.println(list_Strings);
	  // Retrive the first and third element
	  String element = list_Strings.get(0);
	  System.out.println("First element: "+element);
	  element = list_Strings.get(2);
	  System.out.println("Third element: "+element);
	 }
	}


