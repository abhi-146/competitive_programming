package codeforces;

import java.util.Scanner;

public class Food_Buying {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int x = sc.nextInt();
			int burles = 0;
			
			while(x >= 10)
			{
				int rem = x%10;
				burles += x - rem;
				x = x/10 + rem;
			}
			System.out.println(burles + x % 10);
		}
	}

}
