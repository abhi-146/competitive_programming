package codeforces;

import java.util.Scanner;

public class Lenth_And_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		StringBuffer sb = new StringBuffer("");
		
		for(int i =0;i<m;i++)
		{
			for(int d = 0;d<10;d++)
			{
				if(((i == 1 && d == 0) || i > 0 || d > 0 ) && can(m - i - 1,s - d) )
				{
					sb.append(String.valueOf(d));
					s-=d;
					break;
				} 
			}
		}
		if(Integer.parseInt(sb.toString()) <= 0)
			System.out.print("-1 -1");
		else
		System.out.print(sb+ " "+ sb.reverse());
	}

	private static boolean can(int m, int s) {
		return s >= 0 && s <= 9 * m;
	}

}
