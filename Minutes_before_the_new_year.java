package codeforces;

import java.util.Scanner;

public class Minutes_before_the_new_year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			System.out.println((23 - sc.nextInt())*60+(60 - sc.nextInt()));
		}
		sc.close();
	}

}
