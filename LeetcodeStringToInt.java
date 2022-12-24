/* Leetcode Medium level question
 * Input : String s = "40" or "   -42" or "4193 with words"
 * Output : 40 or -42 or 4193
 * 
Constraints:

0 <= s.length <= 200
s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
 * 
 *  1. Call stringtoInt(s) function from main method
 *  2. Pass String s as argument to stringtoInt method
 *  3. Start a For loop, i=0 to i<s.length()
 *  4. Get integer value of each index of string and compare each index with ASCII value
 *  5. If( (a>47 && a<58) || (a==43 || a==45) )
 *  6. Then print the result
 */
package interviewquestions;

public class LeetcodeStringToInt {

	public static void main(String[] args) {

		LeetcodeStringToInt l = new LeetcodeStringToInt();
		String s = "4193 with words";
		l.stringtoInt(s);
	}

	void stringtoInt(String str)
	{
		for(int i=0; i<str.length(); i++)
		{
			int a = (int) str.charAt(i);
			if( (a>47 && a<58) || (a==43 || a==45) )
			{
				System.out.print(str.charAt(i));
			}
		}
	}
}
