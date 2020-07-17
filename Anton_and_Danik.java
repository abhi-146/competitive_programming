package codeforces;

import java.util.Scanner;

public class Anton_and_Danik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		char arr[] = sc.nextLine().toCharArray();
		
		int a = 0;
		int d = 0;
		
		for(char ch : arr)
		{
			if(ch == 'A')
				a++;
			else
				d++;
		}
		if(a > d)
			System.out.print("Anton");
		else if(d > a)
			System.out.print("Danik");
		else
			System.out.print("Friendship");
		
		sc.close();

	}

}
