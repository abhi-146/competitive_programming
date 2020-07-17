package codeforces;
import java.util.Scanner;
public class Magnets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prev =sc.nextInt();
		n--;
		int count = 1;
		while(n-- > 0)
		{
			int curr = sc.nextInt();
			if(curr != prev)
				count++;
			
			prev = curr;
		}
		System.out.println(count);
		sc.close();
	}

}
