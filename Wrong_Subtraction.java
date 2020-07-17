package codeforces;
import java.util.*;
public class Wrong_Subtraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		while(t-- > 0)
		{
			if(n % 10 == 0)
				n/=10;
			else
				n--;
		}
		System.out.print(n);
		sc.close();

	}

}
