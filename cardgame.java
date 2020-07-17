package codeforces;
import java.util.Scanner;


public class cardgame {
	final static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
       int testcases=sc.nextInt();
		while(testcases-->0)
			solve();
		
	}

	private static void solve() {
		 int i, n, k1,k2;
		 n=sc.nextInt();
		 k1=sc.nextInt();
		 k2=sc.nextInt();
		 int arr[]=new int[n];
		 for ( i = 0; i<n; i++)
			 arr[i]=sc.nextInt();
		 for ( i = 0; i<k1; i++)

		    {
		        if (arr[i] == n) {
		            System.out.println("YES");
		            return;
		        }
		    }
		    
		
	System.out.println("NO");}
		 
			 
		 
		 
		
	}


