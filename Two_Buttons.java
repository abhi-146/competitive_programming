package codeforces;

import java.util.Scanner;

public class Two_Buttons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		
		
		while(n < m)
		{
			if(m % 2 == 0)
			{
				m/=2;
				count++;
			}
			else
			{
				m++;
				count++;
			}
		}
		System.out.println(n - m + count);
		sc.close();
	}

}
