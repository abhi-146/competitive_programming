package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Double_Cola {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[] {"Sheldon","Leonard","Penny","Rajesh","Howard"};
		
		int p = 0;
		
		while((1 << p) * 5 < n)
			{
				//System.out.println((1 << p));
				n -= (1 << p) * 5;
				p++;
			
			}
		int ans = (int) ((int)(n - 1)/Math.ceil(1 << p));
		System.out.println(arr[ans]);
	}

}
