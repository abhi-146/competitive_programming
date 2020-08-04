package codeforces;
import java.util.*;
public class Vasya_and_Socks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i = 1;
		
		while(n > 0)
		{
			n--;
			if( i % m == 0)
				n++;
			
			i++;
			
		}
		System.out.println(i - 1);
		sc.close();
	}

}
