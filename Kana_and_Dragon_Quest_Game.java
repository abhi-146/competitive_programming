package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kana_and_Dragon_Quest_Game {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			String input[] = br.readLine().split(" ");
			int h = Integer.parseInt(input[0]);
			int n = Integer.parseInt(input[1]);
			int m = Integer.parseInt(input[2]);
			
			while(h > 0 && n > 0 && (h/2 + 10) < (h ))
			{
				
					h = h/2 + 10;
					n--;
				
			}
			
			
			if(h > m * 10)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}

}
