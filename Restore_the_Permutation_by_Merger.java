package codeforces;

import java.util.Scanner;

public class Restore_the_Permutation_by_Merger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int n = sc.nextInt();
			
			boolean arr[] = new boolean[n + 1];
			n*=2;
			
			while(n-- > 0)
			{
				int x = sc.nextInt();
				
				if(!arr[x])
				{
					System.out.print(x+" ");
					arr[x] = true;
				}
				
			}
			System.out.println();
			
		}
		sc.close();
	}

}
