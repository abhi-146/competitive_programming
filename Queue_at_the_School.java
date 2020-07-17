package codeforces;

import java.util.Scanner;

public class Queue_at_the_School {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		while(t-- > 0)
		{
			for(int i =0;i<n-1;i++)
			{
				if(sb.charAt(i) == 'B' && sb.charAt(i+1) == 'G')
				{
					sb.setCharAt(i, 'G');
					sb.setCharAt(i+1, 'B');
					i++;
				}
			}
		}
		System.out.print(sb);
		sc.close();

	}

}
