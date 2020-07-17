package codeforces;
import java.util.*;
public class Two_Arrays_And_Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int a[] = new int[n];
			int b[] = new int[n];
			
			int sum = 0;
			
			for(int i =0;i<n;i++)
			{
				a[i] = sc.nextInt();
				sum+=a[i];
			}
			
			Arrays.sort(a);
			
			for(int i =0;i<n;i++)
			{
				b[i] = sc.nextInt();
			}
			
			Arrays.sort(b);
			
			int j = 0;
			int i = n - 1;
			
			int temp = n;
		
			while(k > 0 && j < n && i >= 0 && temp-- > 0)
			{
				if(a[j] < b[i])
				{
					sum = sum - a[j] + b[i];
					j++;
					i--;
					k--;
				}
			}
			System.out.println(sum);
			
			
		}
		sc.close();
	}

}
