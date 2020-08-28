package codeforces;

import java.util.Scanner;

public class Mahmoud_and_Ehab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if((sc.nextInt() % 2) == 0)
			System.out.println("Mahmoud");
		else
			System.out.println("Ehab");
		sc.close();
	}

}
