package codeforces;

import java.util.Scanner;

public class Sum_of_Odd_Integer {

	public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        long t = sc.nextLong();
	        while(t-->0)
	        {
	            long n = sc.nextLong();
	            long k = sc.nextLong();
	            
	            if((k*k <= n) && (n % 2 == k % 2))
	            	System.out.println("YES");
	            else
	            	System.out.println("NO");        
	    }
	        sc.close();
	}
}

