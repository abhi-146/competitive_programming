package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Road_to_Zero {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			String xy[] = br.readLine().split(" ");
			String ab[] = br.readLine().split(" ");
			
			long x = Long.parseLong(xy[0]);
			long y = Long.parseLong(xy[1]);
			long a = Long.parseLong(ab[0]);
			long b = Long.parseLong(ab[1]);
			
			
			
			long cost = 0;
			
			
			
			if(b >= 2*a)
			{
				cost += Math.abs(x) * a;
				cost += Math.abs(y) * a;
				
				x = 0;
				y = 0;
			}
			else
			{
				while(x != 0 || y != 0)
				{
					if(x > 0 && y > 0)
					{
						long min = Math.min(x, y);
						x -= min;
						y -= min;
						cost += min * b;
					}
					else if(x < 0 && y < 0)
					{
						long max = Math.max(x, y);
						x += max;
						y += max;
						cost += max * b;
					}
					else
					{
						cost += Math.abs(x) * a;
						cost += Math.abs(y) * a;
						
						x = 0;
						y = 0;
					}
				}
			}
			System.out.println(cost);
		}
	}

}
