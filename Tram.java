package codeforces;
import java.util.*;
public class Tram {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int curr = 0;
		while(n-- > 0)
		{
			curr-=sc.nextInt();
			curr+=sc.nextInt();
			max = Math.max(curr,max);
		}
		System.out.print(max);
		sc.hasNextInt();
	}

}
