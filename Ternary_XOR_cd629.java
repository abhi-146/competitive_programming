package codeforces;

import java.util.Scanner;

public class Ternary_XOR_cd629 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			
			String c = sc.next();
			
			
			StringBuffer a = new StringBuffer("1");
			StringBuffer b = new StringBuffer("1");
			
			
			if(n>=2) {
		
			
			
			
			for(int i=1;i<n;i++)
			{
				if(c.charAt(i) == '0')
				{
					a.append("0");
					b.append("0");
				}
				else if(c.charAt(i) == '1')
				{
					if(Integer.valueOf(a.toString()) > Integer.valueOf(b.toString()))
					{
						a.append("0");
					    b.append("1");
					}
					else
					{
						a.append("1");
					    b.append("0");
					}
					
				}
				else 
					{
					if(Integer.valueOf(a.toString()) > Integer.valueOf(b.toString()))
					{
						a.append("0");
					    b.append("2");
					}
					else if(Integer.valueOf(a.toString()) < Integer.valueOf(b.toString()))
					{
						a.append("2");
					    b.append("0");

					}
					else
					{
						a.append("1");
					    b.append("1");
					}
					}
				
			}
			}
			System.out.println(a);
			System.out.println(b);
			
			
		}

	}

}
