package codeforces;
import java.util.*;
public class Bit_pp {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		int x = 0;
		while(t-- > 0) {
			String str = sc.nextLine();
		    if(str.charAt(1) == '+')
		    	x++;
		    else
		    	x--;
		}
		
		
		System.out.println(x);
		sc.close();
	}

}
