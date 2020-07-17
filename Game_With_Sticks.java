package codeforces;

import java.util.Scanner;

public class Game_With_Sticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int i = 0;
		
		while(n * m > 0)
		{
			n-=1;
			m-=1;
			i++;
		}
		
		if((i & 1) == 1)
			System.out.println("Akshat");
		else
			System.out.println("Malvika");
		
		sc.close();
	}

}
