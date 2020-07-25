package codeforces;

import java.util.Scanner;

public class Design_Tutorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if((n & 1) == 0)
		{
			System.out.println("4 "+(n - 4));
		}
		else
		{
			System.out.println("9 "+(n - 9));
		}
		
		sc.close();
	}

}
