package codeforces;

import java.util.Scanner;

public class cAPS_lOCK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str  = sc.nextLine();
		
		 if(check(str))
			System.out.println(str.toLowerCase());
		else if(check(str.substring(1)))
		System.out.print(str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase());
		else
			System.out.print(str);

	}

	private static boolean check(String str) {
		for(char ch : str.toCharArray())
		{
			if(ch >= 'a' && ch <= 'z')
				return false;
		}
		return true;
	}

}
