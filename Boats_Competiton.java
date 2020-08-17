package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boats_Competiton {

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
			int max = 0;
			int count[] = new int[(2 * n) + 1];
			
			for(int i = 2;i<(2 * n)+1;i++)
			{
				count[i] += pairs(arr,n,i);
				
				max = Math.max(max, count[i]);
			}
			System.out.println(max);
			
		}
	}

	private static int pairs(int[] arr, int n, int sum) {
		
		int l = 0;int r = n - 1;int count = 0;
		
		while(r > l)
		{
			if(arr[r] + arr[l] == sum)
			{
				count++;
				l++;
				r--;
			}
			else if(arr[r] + arr[l] > sum)
				r--;
			
			else
				l++;
			
			
		}
		return count;
	}

}
