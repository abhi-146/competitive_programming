package codeforces;
import java.util.*;
public class Twins {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int coins[] = new int[n];
		int sum = 0;
		for(int i =0;i<n;i++)
		{
			coins[i] = sc.nextInt();
			sum+=coins[i];
		}
		Arrays.sort(coins);
		int iSum = 0;
		for(int i = 1;i<=n;i++)
		{
			iSum += coins[n - i];
			if(iSum > sum/2)
			{
				System.out.println(i);
				break;
				
			}
			
		}sc.close();
		
		
		
		
	}

}
