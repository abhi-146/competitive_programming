package codeforces;
import java.util.*;
public class Calculating_Function {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		if((n & 1) == 1)
			System.out.print(-(n+1)/2);
		else
			System.out.println(n/2);
		
	}

}
