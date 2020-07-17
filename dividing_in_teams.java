package codeforces;
import java.util.*;

public class dividing_in_teams {
	final static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int t=sc.nextInt();
		while(t-->0)
			solve();
		}
	static void solve()
	{
		int i,flag=1;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(i=0;i<n-1;i++)
		{
			if(arr[i+1]-arr[i]==1)
			{
				flag=2;
				
			}
		}
		System.out.println(flag);
		
	}
	

}

