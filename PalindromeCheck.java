package lab3;

import java.util.Stack;
import java.util.Scanner;

/** Use a stack to check whether a string is a palindrome.
 * @author felix
 */
public class PalindromeCheck {

	public static void main(String[] args) {
		
		String userStr, lowercasedStr, reverseStr;
		String testNextString = "y";
		Stack<Character> charStack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		
		while(testNextString.equals("y")) {
			System.out.println("Enter a string:");
			userStr = sc.nextLine().trim();
			lowercasedStr = userStr.replaceAll("\\s+", "").toLowerCase();
			
			for(int i = 0; i < lowercasedStr.length(); i++) {
				charStack.add(lowercasedStr.charAt(i));
			}
			
			reverseStr = "";
			while(!charStack.isEmpty()) {
				reverseStr += charStack.pop();
			}
			
			if(reverseStr.equals(lowercasedStr))
				System.out.println("'" + userStr + "' is a palindrome.");
			else
				System.out.println("'" + userStr + "' is not a palindrome.");
			
			System.out.println("Test another string? y or n.");
			testNextString = sc.nextLine();
			
			while(!testNextString.equals("y") && !testNextString.equals("n")) {
				System.out.println("Please enter y or n");
				testNextString = sc.nextLine().trim();
			}
		}
		
		sc.close();
		
		System.out.println("Goodbye");

	} //end main

} //end PalindromeCheck
