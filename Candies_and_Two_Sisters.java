package codeforces;

import java.util.Scanner;

public class Candies_and_Two_Sisters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int n = sc.nextInt();
		
			int ans = ((n & 1) == 0) ? n/2 - 1 : n/2;
		
			System.out.println(ans);
		}
		
	}

}
