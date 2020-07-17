package codeforces;

import java.util.Scanner;

public class even_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int even = 0;
			int odd = 0;
			for(int i =0;i<n;i++)
			{
				int x = sc.nextInt();
				
				if((i & 1) == 0 && (x & 1) != 0)
					odd++;
				if((i & 1) != 0 && (x & 1) == 0)
					even++;
				
			}
			if(even != odd)
				System.out.println("-1");
			else
				System.out.println(even);
			
		}
		sc.close();
			

	}

}
