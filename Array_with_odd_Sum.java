package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_with_odd_Sum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String input[] = br.readLine().split(" ");
			int arr[] = new int[n];
			boolean even = false;
			boolean odd = false;
			for(int i = 0;i<n;i++)
			{
				arr[i] = Integer.parseInt(input[i]);
				
				if(arr[i] % 2 == 0)
					even = true;
				
				if(arr[i] % 2 == 1)
					odd = true;
			}
			
			if(n % 2 == 1 && odd)
			{
				System.out.println("YES");
			}
			else if(odd && even)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
				
			
			
		}
		
	}

}
