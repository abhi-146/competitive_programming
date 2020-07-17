package codeforces;

import java.util.Scanner;

public class Nearly_Lucky_Number {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char[] input = sc.nextLine().toCharArray();
		int n = 0;
		for(char ch : input) {
			if(ch == '4' || ch == '7')
				n++;
		}
		char[] arr = String.valueOf(n).toCharArray();
		boolean flag = true;
		for(char ch : arr)
		{
			if(ch == '4' || ch == '7')
				continue;
			else
				flag = false;
		}
		if(flag)
			System.out.print("YES");
		else
			System.out.print("NO");
		
		sc.close();
		
	}
	

}
