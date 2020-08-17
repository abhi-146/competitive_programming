package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Cards {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int z = 0,e = 0,r= 0,o= 0,n= 0;
		
		for(char ch : str.toCharArray())
		{
			switch(ch)
			{
			case 'z':
				z++;
				break;
			case 'e':
				e++;
				break;
			case 'r':
				r++;
				break;
			case 'o':
				o++;
				break;
			case 'n':
				n++;
				break;
			}
		}
		
		int one = Math.min(Math.min(o, n), e);
		o -= one;
		n -= one;
		e -= one;
		
		
		int zero = Math.min(Math.min(Math.min(z, e), r), o);
		
		while(one-- > 0)
			System.out.print("1 ");
		
		while(zero-- > 0)
			System.out.print("0 ");
	}

}
