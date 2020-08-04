package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gennady_and_a_Card_Game {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tcard[] = br.readLine().trim().split("");
		String hcard[] = br.readLine().trim().split("");
		
		System.out.println(check(tcard,hcard));
	}

	private static String check(String[] tcard, String[] hcard) {
	//	System.out.println(tcard[0]+" "+tcard[1]);
		for(int i = 0;i<hcard.length;i++)
		{
		//	System.out.println(hcard[i]);
			if(hcard[i].equals(tcard[0]) || hcard[i].equals(tcard[1]))
				return "YES";
		}
		return "NO";
	}

}
