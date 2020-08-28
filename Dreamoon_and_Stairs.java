package codeforces;

import java.util.Scanner;

public class Dreamoon_and_Stairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(m > n)
			System.out.println("-1");
		else
		{
			int minSteps = (n+1)/2 + m;
			int mod = minSteps % m;
			if(mod == 0)
				minSteps -= m; 
			System.out.println(minSteps - mod);
		}
		sc.close();
	}

}
