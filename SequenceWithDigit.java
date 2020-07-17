package codeforces;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SequenceWithDigit {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String input[] = br.readLine().split(" ");
			long a1 = Long.parseLong(input[0]);
			long k = Long.parseLong(input[1]);
			k--;
			while(k-- > 0)
			{
				long y = product(a1);
				if(y == 0)
					break;
				a1 += y;
			}
			System.out.println(a1);
		}
	}

	private static long product(long x) {
		
		long max = 0;
		long min = 10;
		long rem;
		while(x >0)
		{
			rem = x%10;
			max=Math.max(rem, max);
			min=Math.min(rem, min);
			x = x/10;
		}
		return max*min;
	}
}
