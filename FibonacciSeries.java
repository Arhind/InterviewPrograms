/* Fibonacci Series
 *  0,1,1,2,3,5,8....
 */
package arrays;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a[] = new int[100];
		int n=10;
		
		a[0] = 0;
		a[1] = 1;
		for(int i=2; i<n; i++)
		{
			a[i] = a[i-2] + a[i-1];
		}
		
		for( int i=0; i<n; i++)
			System.out.print(a[i]+" ");
	}

}
