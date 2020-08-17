package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Lecture {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nm[] = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		HashMap<String,String> map = new HashMap<>();
		
		while(m-- > 0)
		{
			String s[] = br.readLine().split(" ");
			
			map.put(s[0],s[1]);
		}
		
		String str[] = br.readLine().split(" ");
	//	System.out.println(str.length);
		
		for(String s : str)
		{
			String value = map.get(s);
			
			if(value.length() < s.length())
				System.out.print(value+" ");
			else
				System.out.print(s+" ");
		}
		
		
				
		
	}

}
