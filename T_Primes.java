package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class T_Primes {
	static int maxN  = 1000001;
	static boolean isPrime[] = new boolean[maxN];
	
	public static void generatePrime()
	{
		Arrays.fill(isPrime, true);
		for(int i = 2;i*i<maxN;i++)
		{
			if(isPrime[i])
			{
				for(int j = i*2;j<maxN;j+=i)
				{
					isPrime[j] = false;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		generatePrime();
		while(n-- > 0)
		{
			long x = sc.nextLong();
			
			double sqrt = Math.sqrt(x);
			
			if(x <= 3)
				System.out.println("NO");
			
			else if(sqrt % 1 == 0)
			{
				if(isPrime[(int)sqrt])
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
			else
			{
				System.out.println("NO");
			}
			
		}
		sc.close();
	}
}
