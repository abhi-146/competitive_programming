package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boboniu_Likes_to_Color_Balls {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			String rgbw[] = br.readLine().split(" ");
			
			int r = Integer.parseInt(rgbw[0]);
			int g = Integer.parseInt(rgbw[1]);
			int b = Integer.parseInt(rgbw[2]);
			int w = Integer.parseInt(rgbw[3]);
			
			int min = Math.min(Math.min(r, g), b);
			
			if(check(r,g,b,w))
				System.out.println("YES");
			else if(min > 0 && check(r - 1, g - 1, b - 1, w - 1))
				System.out.println("YES");
			else
				System.out.println("NO");
			
			
			
		}
	}

	private static boolean check(int r, int g, int b, int w) {
		if(r % 2 + g % 2 + b % 2 + w % 2 > 1)
			return false;
		
		return true;
	}

}
