/* Cognizant Interview Question
 * Java Developer, 9 LPA
 * 
 * Print Even numbers before Odd numbers
 * Input : int[] arr = {1, 2, 5, 4, 7, 8, 11, 20}; 
 * Output : 2, 4, 8, 20, 1, 5, 7, 11
 * 
 * 1. Write a method, printEvenThenOdd(arr) and call it from main method
 * 2. Initiate a separate array a[arr.length] in new method and a variable int index=0
 * 3. Initiation a For loop, int i=0 to i<arr.length
 * 4. If arr[i]%2==0 then a[index] = arr[i]
 * 5. index++
 * 6. Initiation another For loop, int i=0 to i<arr.length
 * 7. If arr[i]%2!=0 then a[index] = arr[i]
 * 8. index++
 * 9. Initiation a For loop, int i=0 to i<a.length
 * 10. Print a[i]
 */

package interviewquestions;

public class CTSJava9LPA {

	public static void main(String[] args) {

	int[] arr = {1, 2, 5, 4, 7, 8, 11, 20}; 
	CTSJava9LPA j = new CTSJava9LPA();
	
	j.printEvenThenOdd(arr);
	}
	
	void printEvenThenOdd(int[] arr)
	{
		int[] a = new int[arr.length];
		int index=0;
		
		// Even numbers together
		for( int i=0; i<arr.length; i++)
		{
			if( arr[i]%2 == 0)
			{
				a[index] = arr[i];
				index++;
			}
		}
		// Odd numbers together
		for( int i=0; i<arr.length; i++)
		{
			if( arr[i]%2 != 0)
			{
				a[index] = arr[i];
				index++;
			}
		}
		
		for( int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+", ");
		}
	}
}
