package codeforces;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Bachgold_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int primes = 0;
		
		ArrayList<Integer> primeList = new ArrayList<>();
		
		for(int i = 2;i<=n;i++)
		{
			if((new BigInteger(String.valueOf(i))).isProbablePrime(1))
			{
				while(n - i > 1)
				{
					primes++;
					n-=i;
					primeList.add(i);
				}
			}
		}
		if(n > 1)
		{
			primes ++;
			primeList.add(n);
		}
		System.out.print(primes + "\n");
		for(int i:primeList)
		{
			System.out.print(i+" ");
		}
	}

}
