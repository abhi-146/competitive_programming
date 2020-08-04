package codeforces;

import java.util.Scanner;

public class Boredom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long arr[] = new long[100001];
		
		for(int i = 0;i<n;i++)
		{
			arr[(int)sc.nextLong()]++;
		}
		long ans = 0;
		long max2 = 0;
		long max1 = 0;
		
		for(int i = 1;i<100001;i++)
		{
			ans = Math.max(max1, max2 + (arr[i] * i));
			max2 = max1;
			max1 = ans;
			
			
			
		}
		System.out.println(ans);
		sc.close();
	}
 
}
