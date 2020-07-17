package codeforces;
import java.util.*;

public class Cpe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		while(t-- > 0)
			
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			int count = 0;
		
		
		
			if(a > n || b > n)
				System.out.println("0");
			else
			{
				while(a <= n && b <= n)
				{
					if(a >= b)
					{
						b+=a;
						count++;
					}
					else
					{
						a+=b;
						count++;
					}
						
				}
			}
		System.out.println(count);
		}
	}

}
