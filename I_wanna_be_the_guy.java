package codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class I_wanna_be_the_guy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		var set = new HashSet<Integer>();
		
		int p = sc.nextInt();
		
		while(p-- > 0)
			set.add(sc.nextInt());
		
		p = sc.nextInt();
		while(p-- > 0)
			set.add(sc.nextInt()); 
		
		if(set.size() == n)
			System.out.println("I become the guy.");
		else
			System.out.println("Oh, my keyboard!");
		
	}

}
