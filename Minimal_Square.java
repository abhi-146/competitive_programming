package codeforces;
import java.util.*;
public class Minimal_Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int s = 0;
		
		
			s = (a >=b)?Math.max(2 * b,a):Math.max(2 * a, b);
			
			System.out.println(s*s);
		}
		
		
	}

}
