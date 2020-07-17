package codeforces;

import java.util.Scanner;
import java.util.Stack;

public class Stones_On_The_Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		char arr[] = sc.nextLine().toCharArray();
		Stack<Character> st = new Stack<>();
		int count = 0;
		for(char ch : arr)
		{
			if(st.isEmpty())
				st.push(ch);
			else if(st.peek().equals(ch))
				count++;
			else
				st.push(ch);
				
		}
		System.out.print(count);
		sc.close();

	}

}
 