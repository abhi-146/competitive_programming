package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Night_at_the_Museum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 0;
		int prev = 0;
		for(char ch : str.toCharArray())
		{
			int curr = (int)ch - 97;
		//  System.out.println(curr);
			
			int a = Math.abs(curr - prev);
			int b =26 - a;
			count += Math.min(a, b);
		
		//	System.out.println(count);
			
			prev = curr;
		}
		System.out.println(count);
	}

}

