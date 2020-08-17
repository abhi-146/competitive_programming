package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Erasing_Zeroes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			String str = br.readLine();
			
			int first = str.indexOf("1");
			int end = str.lastIndexOf("1");
			
			int count = 0;
			if( first == end )
				System.out.println("0");
			else
			{
				for(int i = first;i < end ;i++)
				{
				//	System.out.println(i);
					if(str.charAt(i) == '0')
						count++;
				}System.out.println(count);
			}
			
			
		}
	}

}
