package polymorphism;

public class TESTT {

	    public static void main(String[] args) {
	        String str = "hello world hello";
	        String substr = "hello";

	        // Split the string using the substring as the delimiter
	        String[] parts = str.split(substr);

	        // Calculate the occurrences
	        int count = parts.length - 1; // The number of parts will be one more than the occurrences

	        System.out.println("Occurrences of \"" + substr + "\" in the string: " + count);
	    }
	}



