package codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class Anton_and_Letters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = str.substring(1, str.length()-1).split(", ");
		var set = new HashSet<String>();
		
		for(String s : arr)
			{
			    if(s.length() > 0)
			    	set.add(s);
			}
		
		System.out.println(set.size());
	}

}
