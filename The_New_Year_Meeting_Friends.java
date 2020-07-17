package codeforces;

import java.util.Scanner;

public class The_New_Year_Meeting_Friends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int distance = Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c);
		
		System.out.print(distance);
		
	}

}
