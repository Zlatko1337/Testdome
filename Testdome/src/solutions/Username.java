package solutions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*TASK
 * Implement the validate function, which accepts a username and returns true if its's acceptable and false if its not.
 * A username is valid if it satisfies the folowing rules:
 * 	- The username must be at least 4 characters long,
 *  - The username must contain only letters, numbers, and optionally one underscore (_)
 *  - The username must start with letter, and must not end with and underscore
 *  
 *  For example Username.validate("Mike Standish") would return false because of the space
 */
public class Username {

	public static boolean validate(String username) {      
		Pattern pattern = Pattern.compile("^(?=.{4,}$)(?!.*_.*_)(?![0-9_])[a-zA-Z0-9_]*[^_]$");
		Matcher matcher = pattern.matcher(username);
		return (matcher.matches());
	}

	public static void main(String[] args) {
		System.out.println(validate("Mike_Standish")); 	// Valid username
		System.out.println(validate("M9_e")); 			// Valid 
		System.out.println(validate("Mike Standish")); 	// Invalid 
		System.out.println(validate("M__a")); 			// Invalid 
		System.out.println(validate("Mik")); 			// Invalid 
		System.out.println(validate("Miki/nsky")); 		// Invalid 
		System.out.println(validate("9Mike")); 			// Invalid 
		System.out.println(validate("_Mike")); 			// Invalid 
		System.out.println(validate("Mike_")); 			// Invalid 
		System.out.println(validate("M_ik_e")); 		// Invalid 
	}

}

