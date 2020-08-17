package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Remove_Smallest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String input[] = br.readLine().split(" ");
			int arr[] = new int[n];
			
			for(int i = 0;i<n;i++)
			{
				arr[i] = Integer.parseInt(input[i]);
			}
			Arrays.sort(arr);
			
			System.out.println(check(arr));
		}
	}

	private static String check(int[] arr) {
		
		for(int i = 0;i<arr.length - 1;i++)
		{
			if(arr[i + 1] - arr[i] > 1)
				return "NO";
		}
		return "YES";
	}

}
