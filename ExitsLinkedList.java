package assignment2.com;

import java.util.LinkedList;

public class ExitsLinkedList {

	 public static void main(String[] args) {
	  // create an empty linked list
	  LinkedList <String> c1 = new LinkedList <String> ();
	            c1.add("Lion");
	          c1.add("Tiger");
	          c1.add("Shark");
	          c1.add("Bear");
	          c1.add("Woif");
	          System.out.println("Original linked list: " + c1);
	           
	     // Checks whether the animal "Lion" exists or not.
	    if (c1.contains("Lion")) {
	       System.out.println("animal lion is present in the linked list.");
	    } else {
	       System.out.println(" animal lion  is not present in the linked list.");
	     }
	    
	     // Checks whether the color "Orange" exists or not.
	    if (c1.contains("Tiger")) {
	       System.out.println("animal Tiger  is present in the linked list.");
	    } else {
	       System.out.println("animal Tiger  is not present in the linked list.");
	     }
	    
	 }
	}


