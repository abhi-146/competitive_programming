package codeforces;

import java.util.Scanner;

public class Hit_the_Lottery {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var count = 0;
		var bills = new int[] {1,5,10,20,100};
		
		for(var i = 4; i>=0 ;i--)
		{
			while(n > 0)
			{
				if(n - bills[i] >= 0)
				{
					n-=bills[i];
					count++;
				}
				else
				{
					break;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
