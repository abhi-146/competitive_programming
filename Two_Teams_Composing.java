package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Two_Teams_Composing {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String input[] = br.readLine().split(" ");
			int arr[] = new int[n+1];
			HashSet<Integer> set = new HashSet<>();
			int mCount = 0;
			
			for(int i = 0;i<n;i++)
			{
				int x = Integer.parseInt(input[i]);
				set.add(x);
				arr[x]++;
				mCount = Math.max(mCount, arr[x]);
			}
			int size = Math.max(Math.min(set.size() - 1, mCount), Math.min(set.size(), mCount - 1));
			System.out.println(size);
			
			
		}
	}

}
