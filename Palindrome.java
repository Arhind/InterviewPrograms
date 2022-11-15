/* Palindrome Numbers
 * //121 : 1*100+2*10+1*1 
 */

package arrays;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
		int sum=0, i=0;
		
		System.out.println("Enter the number to check pallandrome : ");
		int n = sc.nextInt();
		
		int num = n;
		while(num>0)
		{
			a[i] = num%10;
			num = num/10;
			sum = sum*10 + a[i];	
			i++;
		}
		
		if( sum==n)
			System.out.println(n+" is palindrome");
		else
			System.out.println(n+" is not palindrome");
	}
}