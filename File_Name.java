package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class File_Name {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int count = 0;
		int x = 0;
		
		for(char ch : str.toCharArray())
		{
			if(ch != 'x')
				x = 0;
			
			else
			{
				if(x == 2)
					count++;
				else
					x++;
			}
		}
		System.out.println(count);
	}

}
