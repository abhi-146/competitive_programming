package codeforces;

import java.util.Scanner;

public class New_Year_Candles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = a;
		while(a >= b)
		{
			int remain = a % b;
			a/=b;
			count+=a;
			a+=remain;
			
		}
		System.out.print(count);
	}

}
