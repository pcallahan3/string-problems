package stringprogrammingproblems;

public class StringProblems {

	public static void main(String[] args) {
	
		String newString = "Hello World";
		reverseAString(newString);
		 	    

	}
	
	/* Problem statement: Reverse a string without using the built in reverse() function. 
	 * Psuedocode for reverseAString() function: 
	 *   1. Create a void function that accepts a string named str as a parameter and returns the reversed string.
	 *   2. Declare and initialize a character array named stringChars and convert the string to an array of characters.
	 *   3. Using a for loop set the index to the first index of the array of characters and loop until the index is greater than or equal to 0,
	 *      and decrement the index.
	 *   4. Print the character arrays index.
	 *     
	 */
	
	static void reverseAString(String str) {
		
		char[] stringChars = str.toCharArray();
		for(int i = stringChars.length - 1;i >= 0;i--) {
			
			System.out.print(stringChars[i]);
		}
		
		
	}
	
	
	
}
