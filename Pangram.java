package codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine().toLowerCase();
		if(n < 26)
			System.out.print("NO");
		else
		{
			char[] arr = str.toCharArray();
			HashSet<Character> set = new HashSet<>();
			for(char ch : arr)
			{
				set.add(ch);
			}
			if(set.size() == 26)
				System.out.print("YES");
			else
				System.out.print("NO");
			
		}sc.close();

	}

}
