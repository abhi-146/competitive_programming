package codeforces;

import java.util.Scanner;

public class Multiply_2_Divide_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int x = 0;
			int y = 0;
			
			while(n % 2 == 0)
			{
				x++;
				n/=2;
			}
			
			while(n % 3 == 0)
			{
				y++;
				n/=3;
			}
			if(n != 1 || x > y)
				System.out.println("-1");
			else
				System.out.println(y + (y - x));
		}
		sc.close();
	}

}
