package codeforces;

import java.util.Scanner;

public class Vanya_And_Cubes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = 0;
		int cnt = 0;
		
		
		while(cnt <= n)
		{
			h++;
			cnt += (h*(h+1))/2;
			
		}
		System.out.println(h - 1);
		
		
	}

}
