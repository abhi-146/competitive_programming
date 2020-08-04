package codeforces;

import java.util.Scanner;

public class Brain_Photo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		boolean color = false;
		for(int i = 0;i<n;i++)
		{
			String arr[] = sc.nextLine().split(" ");
			for(int j = 0;j<m;j++)
			{
				char ch = arr[j].charAt(0);
				if(ch == 'C' || ch == 'M' || ch == 'Y')
					color = true;
			}
		}
		
		if(color)
			System.out.println("#Color");
		else
			System.out.println("#Black&White");
		
		sc.close();
		
	}

}
