package codeforces;

import java.util.Scanner;

public class New_Year_and_Hurry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		k = 240 - k;
		int count = 0;
		
		while(k >= 0 && count <= n)
		{
			count++;
			k  = k - (5 * count);
		}
		System.out.println(count - 1);
		sc.close();
	}

}
