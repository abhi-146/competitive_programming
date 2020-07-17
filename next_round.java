package codeforces;
import java.util.*;

public class next_round {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,k,count=0;
		n=sc.nextInt();
		k=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
	    for(i=0;i<n;i++) {
	    	if(arr[i]>=arr[k-1]&&arr[i]>0)
	    		count++;
	    	else 
	    		break;
	    	
	    		
	    }
		System.out.println(count);
		sc.close();
	}

}
