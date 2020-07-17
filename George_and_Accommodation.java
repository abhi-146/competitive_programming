package codeforces;

import java.util.Scanner;

public class George_and_Accommodation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while(n-- > 0)
		{
			if(Math.abs(sc.nextInt() - sc.nextInt()) > 1)
				count++;
		}
		System.out.print(count);
		
		sc.close();
	}

}
