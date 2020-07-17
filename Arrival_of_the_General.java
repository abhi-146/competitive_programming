package codeforces;

import java.util.Scanner;

public class Arrival_of_the_General {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int arr[] = new int[n];
		int x = 0;
		
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		int maxI = 0;
		int minI = n - 1;
		
		for(int i =0;i<n;i++)
		{
			x = sc.nextInt();
			if(x > max)
			{
				max = x;
				maxI = i;
			}
			if(x <= min)
			{
				min = x;
				minI = i;
			}
		}
		
		if(maxI > minI)
		{
			System.out.print((maxI) + (n - 1 - minI  - 1));
		}
		else
		{
			System.out.print((maxI) + (n - 1 - minI));
		}
		
		sc.close();
		
	}

}
