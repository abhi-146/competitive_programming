package codeforces;

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int ans = a + b + c;
		ans = Math.max(ans, (a + b) * c);
		ans = Math.max(ans, a * (b + c));
		ans = Math.max(ans, a * b * c);
		
		System.out.print(ans);
		
		sc.close();
	}

}
