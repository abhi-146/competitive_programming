package codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Omkar_and_Last_Class_of_Math {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int n = sc.nextInt();
			
			if(n % 2 == 0)
				System.out.println(n/2+" "+n/2);
			
			else if(isPrime(n))
			{
				System.out.println("1 "+(n - 1));
			}
			else
			{
				
				int i = 3;
				
				while(i <= Math.sqrt(n))
				{
					if(n % i == 0)
					{
						System.out.println(n/i + " " + (n- n/i));
						break;
					}
					
					i++;
					
					
				}
				
				
				
				
			}
		}
		sc.close();
	}

	private static boolean isPrime(Integer n) {
			return (new BigInteger(n.toString())).isProbablePrime(1);
	}

}
