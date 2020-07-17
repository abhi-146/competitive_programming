package codeforces;

import java.util.Scanner;

public class combination_lock {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String []str=new String[2];
		str[0]=sc.next();
		str[1]=sc.next();
		



		int sum=0;
		for(int i=0;i<n;i++) {
			char ch1=str[0].charAt(i);
			char ch2=str[1].charAt(i);
			int n1=Integer.parseInt(String.valueOf(ch1));
			int n2=Integer.parseInt(String.valueOf(ch2));
			sum=sum+Math.min(add(n1,n2), sub(n1,n2));
			
		}
		System.out.println(sum);
		sc.close();
		
	}

	private static int sub(int n1, int n2) 
	{
		int count=0;
        if(n1>n2) 
        {
        	while(n1!=(n2+10))
        	{
        	    n1++;
        	    count++;
        	}
        }
        else
        {
        	while(n1!=n2)
        	{
        		n1++;
        		count++;
        	}
        }
		return count;
	}

	private static int add(int n1, int n2)
	{
		int count=0;
		if(n1>n2)
		{
			while(n1!=n2)
			{
				n1--;
				count++;
			}
		}
		else
		{
			while(n1!=(n2-10))
			{
				n1--;
				count++;
			}
		}
		return count;
	}

}
