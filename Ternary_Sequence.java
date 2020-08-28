package codeforces;

import java.util.Scanner;

public class Ternary_Sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		while(t-- > 0)
		{
			int x[] = new int[3];
			int y[] = new int[3];
			
			for(int i = 0;i<3;i++)
			{
				x[i] = sc.nextInt();
			}
			
			for(int i = 0;i<3;i++)
			{
				y[i] = sc.nextInt();
			}
			
			long sum = 0;
			
			sum += Math.min(x[2], y[1])*2;
			x[2] -= Math.min(x[2], y[1]);
			y[1] -= Math.min(x[2], y[1]);
			
			int min = Math.min(y[2], x[2]);
			y[2] -= min;
			
			min = Math.min(y[2], x[0]);
			y[2] -= min;
			
			if(y[2] < 0)
				System.out.println(sum);
			
			else
				System.out.println(sum - 2*Math.min(y[2], x[1]));
			
		}
	}

}
