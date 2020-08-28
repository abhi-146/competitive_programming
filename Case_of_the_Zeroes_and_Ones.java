package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Case_of_the_Zeroes_and_Ones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine().trim();
		int ans = 0;
		
		for(char ch : s.toCharArray())
		{
			if(ch == '0')
				ans++;
			else
				ans--;
		}
		System.out.println(Math.abs(ans));
	}

}
