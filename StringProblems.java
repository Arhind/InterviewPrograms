/* All famous problems based on String retrieval
 * 
 * 1. Read char by char
 * PRINT : ASCII, Uppercase, Lowercase, Digit, Remove, Spaces
 * Count : Uppercase, Lowercase, Digit, Vowels, Any char
 * New String : Reverse, Palindrome, Only digits, only char, Reverse case, Encoding
 * 
 * 2. Read word by word
 * PRINT : Each words, Starting with special char, word length, Find word, Longest
 * COUNT : Count words, count specific words, Starting with specific char
 * NEW STRING : Capitalise a word, Swap words, Delete words, Edit words
 */

package interviewquestions;

public class StringProblems {

	public static void main(String[] args) {
		
		String s = "ABCDEF    ghijkl1234567890";
		traversal(s);	//Print String with index value
		asciiValue(s);	//Print ASCII Value
		upperCase(s);	// Print only Uppercase values
		lowercase(s);	// Print only lowercase values
		upperLowerCaseWithMethods(s); 	// Print Uppercase and Lowercase with Character.isUpperCase(c) and Character.isLowerCase(c) methods
		digitThenChar(s); 	// Print all digit first then characters
		removeSpaces(s); 	//Print string without whitespaces
		reverseTheCase(s); 	//Print Uppercase into Lowercase vice versa
		reverseString(s); 	//Print reverse String 			Same thing we can use in Palindrome programs
	}
	
	static String traversal(String s)
	{
		System.out.println("\nPrint String with index value");
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			System.out.println("Index : "+i+"	Char : "+c);			
		}
		return s;
	}
	static void asciiValue(String s)
	{
		System.out.println("\nPrint ASCII Value");
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			int a = (int) c;
			System.out.println("Index : "+i+"	Char : "+c+"	ASCII Value : "+a);
		}
	}
	
	static void upperCase(String s)
	{
		System.out.println("\nPrint only Uppercase values");
		for( int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			int a = (int) c;
			if( a>=65 && a<=90 )
				System.out.println("Index : "+i+"	Char : "+c);
		}
	}
	static void lowercase(String s)
	{
		System.out.println("\nPrint only lowercase values");
		for( int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			int a = (int) c;
			if( a>=97 && a<=122 )
				System.out.println("Index : "+i+"	Char : "+c);
		}
	}
	static void upperLowerCaseWithMethods(String s)
	{
		System.out.println("\nupperLowerCaseWithMethods");
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(Character.isUpperCase(c))
				System.out.println("Character.isUpperCase(c) : "+c);
			if(Character.isLowerCase(c))
				System.out.println("Character.isLowerCase(c) : "+c);
		}
	}
	
	static void digitThenChar(String s1)
	{
		System.out.println("\nPrint all numbers first then characters");
		String s2 = "";
		String s3 = "";
		
		for( int i=0; i<s1.length(); i++)
		{
			char c = s1.charAt(i);
			int a = (int) c;
			if( a>=48 && a<=57 )
			{
				s2 = s2+c;
			}
			else
			{
				s3 = s3+c;
			}
		}
		
		System.out.println("Final String : "+s2+s3);
	}
	
	static void removeSpaces(String s)
	{
		System.out.println("\nRemoving all the white spaces");
		for( int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			int a = (int) c;
			if( a!=32 )
			{
				System.out.print(s.charAt(i));
			}
		}
	}
	
	static void reverseTheCase(String s)
	{
		System.out.println("\n\nPrint uppercase char to lowercase and vice-versa : "+s);
		String upperCase = " ";
		String lowerCase = " ";
		
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			int a = (int) c;
			if( a>=65 && a<=90)
			{
				a+=32;
				lowerCase = lowerCase+(char) a;
			}
			
			int b = (int) c;
			if( b>=97 && b<=122)
			{
				b-=32;
				upperCase = upperCase+(char) b;
			}
		}
		System.out.println("UpperCase char to Lowercase : "+lowerCase);
		System.out.println("lowerCase char to UpperCase : "+upperCase);
	}
	
	static void reverseString(String s)
	{
		System.out.println("\nReverse the string");
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}

