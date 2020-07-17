package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class O1_Game {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0)
		{
			
			String s = br.readLine();
			
			StringBuffer str = new StringBuffer(s);
			
			int count = 0;
			
			int x = str.length();
					
			while(x>0)
			{
				for(int i =0;i<str.length()-1;i++)
				{
					if((str.charAt(i) == '0' && str.charAt(i+1) == '1' )||(str.charAt(i) == '1' && str.charAt(i+1) == '0'))
				   {
						str.delete(i,i+2);
						count++;
						i++;
				   }
				}
				
				
				if(str.length() == x)
					break;
				else
					x = str.length();
			}
			
			
			if((count & 1) == 1)
				System.out.println("DA");
			else
				System.out.println("NET");
			
		
		}
	}

}
