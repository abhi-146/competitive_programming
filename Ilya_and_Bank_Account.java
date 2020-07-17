package codeforces;

import java.util.Scanner;

public class Ilya_and_Bank_Account {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 0)
		{
			StringBuffer s = new StringBuffer(String.valueOf(n));
			int len = s.length();
			if(s.charAt(len - 1) > s.charAt(len - 2))
				s.deleteCharAt(len - 1);
			else
				s.deleteCharAt(len-2);
			
			System.out.println(Integer.parseInt(s.toString()));
				
		}
		else
		{
			System.out.println(n);
		}
		sc.close();
	}

}
