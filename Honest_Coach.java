package codeforces;

import java.util.Scanner;

public class Honest_Coach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for(int i = 0;i<n;i++)
				arr[i] = sc.nextInt();
			
			int min = Integer.MAX_VALUE;
			
			for(int i =0;i<n;i++)
			{
				for(int j = 0;j<n;j++)
				{
					if(i != j)
					{
						min = Math.min(min, Math.abs(arr[i] - arr[j]));
					}
				}
			}
			
			System.out.println(min);
		}
		sc.close();
	}

}
