package codeforces;

import java.util.Scanner;

public class Flipping_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int  ones = 0;
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			ones += arr[i];
			
			if(arr[i] == 0)
				arr[i] = 1;
			else
				arr[i] = -1;
		}
		
		if(ones == n)
		{
			System.out.println(n - 1);
		}
		else
		{
			int max = 0;
			int maxsf = 0;
			for(int i = 0;i<n;i++)
			{
				maxsf = Math.max(0,arr[i] + maxsf);
				
				if(maxsf > max)
				{
					max = maxsf;
				}
			}
			System.out.println(max + ones);
		}
		
	}

}
