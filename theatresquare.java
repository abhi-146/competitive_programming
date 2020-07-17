package codeforces;
import java.util.*;

public class theatresquare {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long m,n,a,l,w;
		m=sc.nextLong();
		n=sc.nextLong();
		a=sc.nextLong();
		l=m/a;
		w=n/a;
		if(m%a!=0)l++;
		if(n%a!=0)w++;
		
		
				System.out.println(l*w);
		
		sc.close();
	}
	}


