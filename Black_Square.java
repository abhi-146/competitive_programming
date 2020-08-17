package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Black_Square {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().trim().split(" ");
		String str[] = br.readLine().trim().split("");
		
		long sum = 0;
		for(String s : str)
		{
			int index = Integer.parseInt(s);
			sum += Integer.parseInt(input[index - 1]);
		}
		
		System.out.println(sum);
		

	}

}
