package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Collections;

public class Sereja_and_Suffixes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nm[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		String input[] = br.readLine().split(" ");
		int arr[] = new int[n+1];
		
		for(int i = 1;i<n+1;i++)
		{
			arr[i] = Integer.parseInt(input[i-1]);
		}
		int ans[] = new int[n+1];
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = n;i>=1;i--)
		{
			set.add(arr[i]);
			ans[i] = set.size();
		}
		
		for(int i = 0;i<m;i++)
		{
			int q = Integer.parseInt(br.readLine());
			System.out.println(ans[q]);
		}
		
	}

}
