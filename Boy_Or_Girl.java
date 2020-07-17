package codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class Boy_Or_Girl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char arr[] = sc.nextLine().toCharArray();
		HashSet<Character> set = new HashSet<>();
		for(char ch : arr)
			set.add(ch);
		if((set.size() & 1) == 0)
			System.out.print("CHAT WITH HER!");
		else
			System.out.print("IGNORE HIM!");
		sc.close();
	}

}
