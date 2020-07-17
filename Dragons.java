package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Dragons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		
		pair[] dragon = new pair[n];
		
		for(int i = 0;i<n;i++)
		{
			dragon[i] = new pair(sc.nextInt(),sc.nextInt());
		}
		
		Arrays.sort(dragon);
		
		System.out.println(result(dragon,s,n));
		
		
		
	}
	private static String result(pair[] dragon, int s, int n) {
		
		for(int i = 0;i<n;i++)
		{
			if(s >dragon[i].x)
			{
				s+=dragon[i].y;
			}
			else
			{
				return "NO";
			}
			
			
		}
		return "YES";
	}
	static class pair implements Comparable<pair>
	{
		int x;
		int y;
		
		public pair(int x,int y)
		{
			this.x = x;
			this.y = y;
		}
	
		@Override
		public int compareTo(pair o) {
			return this.x - o.x;
		}
		
		
	}

}
