package codeforces;

import java.util.Scanner;

public class cut_Ribbon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		
		int ans = 0;
		
		for(int x = 0;x<=4000;x++)
		{
			for(int y = 0;y<=4000;y++)
			{
				double z = (n - x*a - y*b)/(double)c;
			
				if(z < 0)
					break;
				if((z % 1 == 0) && z >= 0)
				{
					ans = (int) Math.max(ans, (x+y+z));
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
