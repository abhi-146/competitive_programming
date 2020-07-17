package codeforces;

import java.util.Scanner;

public class Maximum_in_Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dp[][] = new int[n][n];
		
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				if(i == 0 || j == 0)
					dp[i][j] = 1;
				else
				{
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}
			}
		}
		System.out.println(dp[n-1][n-1]);
		sc.close();
	}

}
