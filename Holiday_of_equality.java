package codeforces;

import java.util.Scanner;

public class Holiday_of_equality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int sum = 0;
		int arr[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}
		for(int i = 0;i<n;i++)
		{
			sum+=Math.abs(max - arr[i]);
		}
		System.out.println(sum);
		sc.close();
	}

}
