package codeforces;

import java.util.Scanner;

public class Games {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int h[] = new int[n];
		
		for(int i =0;i<n;i++)
		{
			a[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for(int i = 0; i<n ; i++)
		{
			for(int j = 0 ; j<n ; j++)
			{
				if(h[j] == a[i])
					count++;
			}
		}
		System.out.print(count);
		
		sc.close();
		
	}

}
