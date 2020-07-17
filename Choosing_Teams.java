package codeforces;

import java.util.Scanner;

public class Choosing_Teams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int count = 0;
		for(int i = 0;i<n;i++)
		{
			if(5 - sc.nextInt()>= k)
				count++;
		}
		
		System.out.println(count/3);
		
	}

}
