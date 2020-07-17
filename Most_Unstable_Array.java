package codeforces;

import java.util.Scanner;

public class Most_Unstable_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			System.out.println(Math.min(2,n-1)*m);
	
		}
	}

}
