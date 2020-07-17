package codeforces;

import java.util.Scanner;

public class lucky_division {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		String flag = "NO";
		for(int i = 4;i<777;i++)
		{
			if(isLucky(i) && (n % i) == 0)
			{
				flag = "YES";
				
			}
			
		}
		System.out.print(flag);
		sc.close();

	}

	private static boolean isLucky(int i) {
		String iStr = String.valueOf(i);
		for(char ch : iStr.toCharArray())
		{
			if(ch == '4' || ch == '7')
				continue;
			else
				return false;
		}
		return true;
	}

}
