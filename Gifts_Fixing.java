package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Gifts_Fixing {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String input[] = br.readLine().split(" ");
			String input0[] = br.readLine().split(" ");
			
			int candies[] = new int[n];
			int oranges[] = new int[n];
			
			int minC = Integer.MAX_VALUE;
			int minO = Integer.MAX_VALUE;
			
			for(int i = 0;i<n;i++)
			{
				candies[i] = Integer.parseInt(input[i]);
				
				if(candies[i] < minC)
					minC = candies[i];
				
				oranges[i] = Integer.parseInt(input0[i]);
				
				if(oranges[i] < minO)
					minO = oranges[i];
			}
			long count = 0;
			
			for(int i = 0;i<n;i++)
			{
				int c = 0;
				if(candies[i] > minC)
				{
					c = candies[i] - minC;
				}
				
				int o = 0;
				if(oranges[i] > minO)
				{
					o = oranges[i] - minO;
				}
				
				count += Math.max(c, o);
					
			}
			System.out.println(count);
			
		}
	}


}
