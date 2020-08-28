package codeforces;

import java.util.Scanner;

public class Epic_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int h = sc.nextInt();
	
		
		for( int i =0;;i++)
		{
			if(i % 2 == 0)
			{
				h -= GCD(a,h);
				
				if(h < 0)
				{
					System.out.println("1");
					break;
				}
			}
			else
			{
				h -= GCD(b,h);
				
				if(h < 0)
				{
					System.out.println("0");
					break;
				}
			}
		}
		
	}
	static int GCD(int a,int b)
	{
		if(b == 0)
			return a;
		else
			return GCD(b,a%b);
	}

}
