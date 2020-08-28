package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Mere_Array {
	
	static long GCD(long a ,long b)
	{
		if(b == 0)
			return a;
		else
			return GCD(b,a % b);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			
			String input[] = br.readLine().split(" ");
			long arr[] = new long[n];
			long min = Integer.MAX_VALUE;
				
			for(int i = 0;i<n;i++)
			{
				arr[i] = Long.parseLong(input[i]);
				min = Math.min(min, arr[i]);
			}
			
			boolean status = solve(arr,min);
			
			if(status)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	private static boolean solve(long[] arr,long min) {
		if(arr.length == 1)
			return true;
		
		ArrayList<Long> list = new ArrayList<>();
		
		for(int i = 0;i<arr.length;i++)
		{
			if(GCD(arr[i],min) == min)
			{
				list.add(arr[i]);
				arr[i] = -1;
			}
		}
		Collections.sort(list);
		int x = 0;
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] == -1)
			{
				arr[i] = list.get(x++);
			}
		}
		
		for(int i = 0;i<arr.length - 1;i++)
		{
			if(arr[i] > arr[i+1])
				return false;
		}
		
		return true;
	}

}
