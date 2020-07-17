package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Team_Olpmpiad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer>[] arr = new ArrayList[3];
		
		for(int i = 0;i<3;i++)
			arr[i] = new ArrayList<Integer>();

		
		for(int i = 1;i<=n;i++)
		{
			int x = sc.nextInt();
			
			arr[x - 1].add(i);
		}
		
		int min = Math.min(arr[0].size(),Math.min(arr[1].size(), arr[2].size()));
		
		System.out.println(min);
		
		for(int i = 0;i<min;i++)
		{
			System.out.println(arr[0].get(i)+" "+arr[1].get(i)+" "+arr[2].get(i));
		}
		sc.close();
		
		
	}

}
