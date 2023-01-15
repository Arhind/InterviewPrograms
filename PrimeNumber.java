//	Prime Number

import java.util.Scanner;

public class PrimeNumber{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int flag=1;
		sc.close();
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				flag++;
				break;
			}
		}
		if(flag==1)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");			
	}
}