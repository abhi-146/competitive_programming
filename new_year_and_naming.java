package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class new_year_and_naming {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nm[] = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		String s[] = br.readLine().split(" ");
		String t[] = br.readLine().split(" ");
		
		int q = Integer.parseInt(br.readLine());
		
		while(q-- > 0) 
		{
			long x = Long.parseLong(br.readLine()) - 1;
			System.out.println(s[(int)(x % n)]+t[(int)(x % m)]);
		}
	}

}
