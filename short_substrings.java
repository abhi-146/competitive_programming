package codeforces;

import java.util.Scanner;

public class short_substrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-- > 0)
		{
		
			String str = sc.nextLine();
			System.out.print(str.charAt(0)+""+str.charAt(1));
			for(int i = 3;i<str.length();i+=2)
			{
				System.out.print(str.charAt(i));
			}
			System.out.println();
			
		}
		sc.close();

	}

}
