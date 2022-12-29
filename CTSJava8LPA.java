/* CTS Interview Question
 * Java Developer, 8 LPA
 * 
 * Write Java program to separate positive & negative numbers from array
 * and print the count of total positive & negative numbers
 * 
 * Input : 
 * Array = [ 9, 10, -18, 20, -27, 30, -36, 40, 45, 50]
 * 
 * Output : 
 * Total Positive numbers : 7
 * Positive number array : [9, 10, 20, 30, 40, 45, 50]
 * Total Negative numbers : 3
 * Negative number array : [-18, -27, -36]
 * 
 * 1. Take input array from user
 * 2. Declare 2 integer array for storing positive and negative arrays
 * 3. Declare 2 variables for storing count of positive and negative numbers separately
 * 4. For Loop -> 
 * 5. 			if(array[i]>=0) 
 * 6. 						Store value in positiveIntegerArray and increase the positive number count by 1
 * 7. 			else
 * 8. 						Store value in negativeIntegerArray and increase the negative number count by 1
 * 9. Print Positive number count and array together.
 * 10. Print Negative number count and array together.
 */

package interviewquestions;

public class CTSJava8LPA {

	public static void main(String[] args) {
		
		int[] array = { 9, 10, -18, 20, -27, 30, -36, 40, 45, 50};
		
		int[] positiveIntegerArray = new int[10];
		int[] negativeIntegerArray = new int[10];
		int j=0, k=0, positive_count=0, negative_count=0;
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i] >= 0)
			{
				positiveIntegerArray[j] = array[i];
				j++;
				positive_count++;
			}
			else
			{
				negativeIntegerArray[k] = array[i];
				k++;
				negative_count++;
			}
		}
		
		System.out.println("Total Positive Number : "+positive_count);
		System.out.print("Positive Number Array : ");
		for(int i=0; i<positive_count; i++)
		System.out.print(positiveIntegerArray[i]+" ");
		
		System.out.println("\n\nTotal Negative Number : "+negative_count);
		System.out.print("Negative Number Array : ");
		for(int i=0; i<negative_count; i++)
		System.out.print(negativeIntegerArray[i]+" ");
	}
}