package codeforces;

import java.util.Scanner;

public class New_Year_Transportation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		boolean flag  = false;
		int arr[] = new int[n];
		
		for(int i = 1;i<n;i++)
		{
			arr[i] = sc.nextInt();
			
			
		}
		for(int i = 1;i<n;)
		{
			if(i + arr[i] == t)
				flag = true;
			
			i = arr[i] + i;
		}
		System.out.println((flag)?"YES":"NO");
		
		
		
		sc.close();
		
	}

}
