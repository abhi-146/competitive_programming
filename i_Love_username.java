package codeforces;

import java.util.Scanner;

public class i_Love_username {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int count = 0;
		
		if(t < 2)
		{
			count = 0;
		}
		else
		{
			int max = sc.nextInt();
			int min = max;
			t--;
			
			while(t-- > 0)
			{
				int x = sc.nextInt();
				
				if(x < min)
				{
					min = x;
					count++;
				}
				else if(x > max)
				{
					max = x;
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
