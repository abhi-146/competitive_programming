package codeforces;

import java.util.Scanner;

public class Captain_Flint_and_Crew_Recruitment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			
			if(n < 31)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
				int x = n - 30;
				
				if(x == 6 || x == 10 || x == 14)
				{
					System.out.println("6 10 15 "+(x - 1));
				}
				else
				{
					System.out.println("6 10 14 "+x);
				} 
			}
		}
		sc.close();
	}

}
