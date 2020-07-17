package codeforces;

import java.util.Scanner;

public class Vanya_and_Fence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		
		int width = 0;
		
		while(n-- > 0)
		{
			width +=(sc.nextInt() > h) ? 2 : 1;
		}
		
		System.out.println(width);
		
		sc.close();
	}

}
