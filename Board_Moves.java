package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Board_Moves {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long t = Long.parseLong(br.readLine());
		 while(t-- > 0)
		 {
			 long n = Long.parseLong(br.readLine());
			 long ans = 0;
			  
			  for(long i = 1;i<=n/2;i++)
			  {
				  ans = ans + (i * i * 1L);
			  }
			  System.out.println(ans*8*1L);
		 }
		
	}
 
}
