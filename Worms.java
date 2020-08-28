package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Worms {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long sum[] = new long[n];
		String input[] = br.readLine().split(" ");
		sum[0] = Integer.parseInt(input[0]);
		
		for(int i = 1;i<n;i++)
		{
			sum[i] += sum[i-1] + Integer.parseInt(input[i]);
		}
		
		int m = Integer.parseInt(br.readLine());
		String queries[] = br.readLine().split(" ");
		
		for(int i = 0;i<m;i++)
		{
			long q = Long.parseLong(queries[i]);
			long ans = Arrays.binarySearch(sum, q);
			
			if(ans < 0)
				 System.out.println(Math.abs(ans));
			else
				System.out.println(ans + 1);
		}
	}

}
