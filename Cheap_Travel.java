package codeforces;

import java.util.Scanner;

public class Cheap_Travel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = 0;
		
		if(m * a > b)
		{
			int remain = (n % m) * a;
			if(remain > b)
				ans = n/m * b + b;
			else
				ans = n/m * b + remain;
		}
		else
			ans = n * a;
		
		System.out.println(ans);
		
		sc.close();
	}
	

}
