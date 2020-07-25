package codeforces;
import java.util.*;
public class Balanced_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			n/=2;
			if(n % 2 == 1)
				System.out.println("NO");
			else
			{
				System.out.println("Yes");
				int even = 0;
				int odd = -1;
				int evenSum = 0;
				int oddSum = 0;
				for(int i = 0;i<n;i++)
				{
					even+=2;
					evenSum+=even;
					System.out.print(even+" ");
				}
				for(int i = 0;i<n-1;i++)
				{
					odd+=2;
					oddSum+=odd;
					System.out.print(odd+" ");
				}
				System.out.print(evenSum - oddSum);
				System.out.println();
			}
		}sc.close();
	}

}
