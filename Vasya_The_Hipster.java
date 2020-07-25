package codeforces;

import java.util.Scanner;

public class Vasya_The_Hipster {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min = Math.min(a,b);
		int max = Math.max(a, b);
		System.out.println(min + " "+(max - min )/2);
		sc.close();
	}

}
