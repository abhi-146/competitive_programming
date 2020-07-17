package codeforces;
import java.util.*;
public class soldier_and_bananas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		int cost = ((k*w*(w+1)/2) - n);
		System.out.print((cost > 0)?cost : 0);
		sc.close();

	} 

}
