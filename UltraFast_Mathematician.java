package codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class UltraFast_Mathematician {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		for(int i = 0; i<str1.length();i++)
		{
			System.out.print((str1.charAt(i)-'0')^(str2.charAt(i)-'0'));
		}
		sc.close();
		 
		
		
	}

}
