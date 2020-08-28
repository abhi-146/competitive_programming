package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char d = br.readLine().charAt(0);
		int v = (d == 'R')?-1:1;
		String str = br.readLine();
		String original = "qwertyuiopasdfghjkl;zxcvbnm,./";
		
		for(char ch : str.toCharArray())
		{
			System.out.print(original.charAt(original.indexOf(ch) + v));
		}
		
	}

}
