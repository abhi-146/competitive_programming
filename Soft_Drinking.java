package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soft_Drinking {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		int l = Integer.parseInt(input[2]);
		int c = Integer.parseInt(input[3]);
		int d = Integer.parseInt(input[4]);
		int p = Integer.parseInt(input[5]);
		
		int nl = Integer.parseInt(input[6]);
		int np = Integer.parseInt(input[7]);
		
		int ans = (k*l)/nl;
		ans = Math.min(ans, c * d);
		ans = Math.min(ans, p/np);
		System.out.println(ans/n);
	}

}
