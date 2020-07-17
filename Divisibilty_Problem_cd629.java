package codeforces;
import java.util.*;

public class Divisibilty_Problem_cd629 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0)
		{
			int count = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int diff = Math.abs(a-b);
			if(a % b == 0)
				System.out.println(count);
			else if(a < b)
				System.out.println(b-a);
			else
				System.out.println(b-(a%b));
			 
		}
	}

}
