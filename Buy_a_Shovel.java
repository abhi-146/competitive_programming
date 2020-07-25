package codeforces;

import java.util.Scanner;

public class Buy_a_Shovel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int temp = k;
		int r = sc.nextInt();
		int count = 1;
		
		while(k % 10 != 0 && k % 10 != r)
		{
			count++;
			k+=temp;
			
		}
		System.out.println(count);
		sc.close();
	}

}
