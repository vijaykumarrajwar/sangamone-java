package assignment2.com;

public class ContentOfString {
	    public static void main(String[] args) {
			
		
		        String str1 = "java is favorite programming language.";
		        String str2 = "python is also my favorite programming language.";

		        // The String to check the above two Strings to see
		        // if they start with this value (java).
		        String startStr = "java";

		        // Do either of the first two Strings start with startStr?
		        boolean starts1 = str1.startsWith(startStr);
		        boolean starts2 = str2.startsWith(startStr);

		        // Display the results of the startsWith calls.
		        System.out.println( str1 + " starts with " +
		             startStr + "? " + starts1);
		        System.out.println(str2 + " starts with " +
		             startStr + "? " + starts2);
		    }
		}

