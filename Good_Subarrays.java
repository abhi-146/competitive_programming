package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Good_Subarrays {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String input[] = br.readLine().split("");
			
			int arr[] = new int[n];
			
			for(int i = 0;i<n;i++)
			{
				arr[i] = Integer.parseInt(input[i]);
				arr[i]--;
			}
			
			int pref[] = new int[n];
			pref[0] = arr[0];
			
			for(int i =1;i<n;i++)
			{
				pref[i] = pref[i-1] + arr[i];
			}
			
			HashMap<Integer,Integer> mp = new HashMap<>();
			
			long answer = 0;
			mp.put(0,1);
			
			for(int i = 0;i<n;i++)
			{
				if(mp.containsKey(pref[i]))
		        {
		            answer += mp.get(pref[i]);
		            mp.put(pref[i], mp.get(pref[i]) + 1);
		             
		        }
		        else
		        {
		            mp.put(pref[i], 1);
		        }
			}
			System.out.println(answer);
		
			
		}
	}

}
