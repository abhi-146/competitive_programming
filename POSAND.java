package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class POSAND {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine().trim());
			if(n < 4)
			switch(n)
			{
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("-1");
				break;
			case 3:
				System.out.println("2 3 1");
				break;
				
			}
			else
			{	
				if(check(n))
					System.out.println("-1");
				else
				{
					System.out.print("2 3 1 ");
					int rem = 0;
					for(int i = 4;i<=n;i++)
					{
						if(rem > 0)
							{
								System.out.print(i+" ");
								System.out.print(rem+" ");
								rem = 0;
								
							
							}
						else
						{
							if(check(i))
							{
								
								rem = i;
							}
							else 
							{
								System.out.print(i+" ");
							}
						}
					}
				}
				
			}System.out.println();
				
		}
	}

	private static boolean check(int n) {
		if(n==0)
		    return false;
		 
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == 
		       (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}

}
