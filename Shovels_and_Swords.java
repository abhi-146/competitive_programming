package codeforces;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Shovels_and_Swords {
 
  
		public static void main(String args[]) throws NumberFormatException, IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while(t-- > 0)
			{
				String input[] = br.readLine().split(" ");
				int a = Integer.parseInt(input[0]);
				int b = Integer.parseInt(input[1]);
				int max = Math.max(a, b);
				int min = Math.min(a, b);
				int count = 0;
				if(a == 0 || b == 0)
					count = 0;

				else if(max/2 >= min)
					count = min;

				else 
				{
					count =(min + max)/3;
					
				}
				
				System.out.println(count);
					
			}
		}
	}
 
 