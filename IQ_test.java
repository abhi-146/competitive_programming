package codeforces;

import java.util.Scanner;

public class IQ_test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		var arr = new int[n];
		for(var i = 0;i<n;i++)
		{
			arr[i] = (sc.nextInt() & 1);
		}
		
		System.out.print(solve(n,arr));
		
		sc.close();
		
		

	}

	private static int solve(int n, int[] arr) {
		for(var i = 1;i<n-1;i++)
		{
			if(arr[i] != arr[i-1] && arr[i] != arr[i+1])
			{
				return(i + 1);
			}
		}
		if(arr[0] != arr[1])
		{
			return(1);
			
		}
		else
		return(n);
	
	}

}
