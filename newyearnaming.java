package codeforces;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class newyearnaming {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,m,i,q;
		
		n=sc.nextInt();
		
		m=sc.nextInt();
		
		System.out.println(m+" "+n);
		
		String str1=sc.nextLine();
	    System.out.println(str1);
	    
		String str2=sc.nextLine();
	
		
		System.out.println(str2);
		StringTokenizer st1=new StringTokenizer(str1," ");
		StringTokenizer st2=new StringTokenizer(str2," ");
		String list1[]=new String[n];
		String list2[]=new String[m];
		i=0;
		while(st1.hasMoreTokens())
		{
			list1[i]=st1.nextToken();i++;
		}
		i=0;
		while(st2.hasMoreTokens())
		{
			list2[i]=st2.nextToken();i++;
		}
		
		
		
		
		q=sc.nextInt();
		while(q-->0)
		{
			String word="";
			int year=sc.nextInt();
		
			if(year%n==0)
			{
				word=word.concat(list1[n-1]);
			}
			else
			{
				word=word.concat(list1[(year%n)-1]);
			}
			if(year%m==0)
			{
				word=word.concat(list2[m-1]);
			}
			else
			{
				word=word.concat(list2[(year%m)-1]);
			}
			System.out.println(word);
		}
		

		
		sc.close();
	}

}
