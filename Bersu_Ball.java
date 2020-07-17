package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Bersu_Ball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		var boys = new int[n];
		
		for(int i = 0;i<n;i++)
			boys[i] = sc.nextInt();
		
		var m = sc.nextInt();
		var girls = new int[m];
		
		for(int i =0;i<m;i++)
			girls[i] = sc.nextInt();
		
		Arrays.sort(boys);
		Arrays.sort(girls);
		
		var b = 0;
		var g = 0;
		var count = 0;
		
		while(b < n && g < m)
		{
			if(Math.abs(boys[b] - girls[g]) <= 1)
			{
				count++;
				b++;
				g++;
			}
			else if(boys[b] > girls[g])
			{
				g++;
			}
			else
			{
				b++;
			}
			
		}
		System.out.println(count);
		
		sc.close();
	}

}
