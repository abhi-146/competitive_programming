package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shuffle {

  
		public static void main(String args[]) throws NumberFormatException, IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while(t-- > 0)
			{
				String input[] = br.readLine().split(" ");
				int n = Integer.parseInt(input[0]);
			
				int x = Integer.parseInt(input[1]);
				
			   
				int m = Integer.parseInt(input[2]);
				int left = x;
				int right = x;
				while(m-->0)
				{
					String input0[] = br.readLine().split(" ");
					int l = Integer.parseInt(input0[0]);
					int r = Integer.parseInt(input0[1]);
					
					if((left >= l && left <= r)||(right<=r&&right>=l))
					{
						left = Math.min(left, l);
						right = Math.max(right, r);
					}
					
				}
				System.out.println(right - left + 1);
				
			}
		}
	}


