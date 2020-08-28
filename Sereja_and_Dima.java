package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sereja_and_Dima {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");
		int arr[] = new int [t];
		
		for(int i = 0;i<t;i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(input);
		int s = 0;
		int d = 0;
		
		int start = 0;
		int end = t - 1;
		
		boolean turn = true;
		while(start <= end)
		{
			if(arr[start] >=arr[end]) {
				if(turn)
					s+=arr[start];
				else
					d+=arr[start];
				start++;
				turn = !turn;

			}
			else
			{
				if(turn)
					s+=arr[end];
				else
					d+=arr[end];
				end--;
				turn = !turn;
			}
				
		}
		
		System.out.println(s+" "+d);
		
	}

}
