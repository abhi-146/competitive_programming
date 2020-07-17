package codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class Beautiful_year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		
		while(true)
		{
			if(check(++y))
			{
				System.out.print(y);
				break;
			}
		}
		sc.close();
		
	}

	private static boolean check(int i) {
		String str = String.valueOf(i);
		
		var set = new HashSet<Character>();
		for(char ch : str.toCharArray())
		{
			set.add(ch);
		}
		if(set.size() == 4)
		return true;
		else
			return false;
	}

}
