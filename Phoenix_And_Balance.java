package codeforces;
import java.util.*;
public class Phoenix_And_Balance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			
			int a = 0;
			int b = 0;
			int i = 1;
			
			for(int k = 0; k < n/2 - 1 ;k++)
			{
				a+=(int) Math.pow(2, i);
				i++;
				
			}
			
			for(int k = 0;k<n/2;k++)
			{
				b+=(int) Math.pow(2, i);
				i++;
			}
			
			a+=Math.pow(2, n);
			
			System.out.println(Math.abs(a - b));	
		
			
		}
	}

}
