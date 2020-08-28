package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alternating_Subsequences {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(br.readLine());
		
		while(t-- > 0)
		{
			long n = Long.parseLong(br.readLine());
			long sum = 0;
			
			
			String input[] = br.readLine().split(" ");
			long arr[] = new long[(int)n];
			
			for(int i = 0;i<n;i++)
			{
				arr[i] = Long.parseLong(input[i]);
			}
			int i = 0;
			while(i<n)
			{
				long pos = 0;
				long neg = Integer.MIN_VALUE;
				
				while(i < n && arr[i] >0)
				{
					pos = Math.max(pos,arr[i]);
					i++;
				}
				if(pos > 0)
					sum+=pos;
				
				
				while( i < n && arr[i] < 0)
				{
					neg = Math.max(neg, arr[i]);
					i++;
				}
				if(neg > Integer.MIN_VALUE)
					sum+=neg;
			}
			System.out.println(sum);
			
		}
	}

}
