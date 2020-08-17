package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multipication_Table{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int x = Integer.parseInt(input[1]);
		
		int count = 0;
		
		for(int i = 1;i <= Math.sqrt(x);i++)
		{
			if(x % i == 0)
			{
				if(i <= n && (x / i) <= n)
				{
					if(i == (x/i))
						count++;
					else
						count+=2;
				}
			}
		}
		if(n == 1 || x == 1)
		{
			if(x > n)
				System.out.println("0");
			else
				System.out.println("1");
		}
		else
		System.out.println(count);
	}

}
