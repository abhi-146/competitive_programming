package codeforces;

import java.util.Scanner;

public class Common_Prefixes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			int max = 0;
			
			for(int i = 0;i<n;i++)
			{
				arr[i] = sc.nextInt();
				max = Math.max(max, arr[i]);
			}
			
			StringBuffer sb = new StringBuffer("b");
			
			while(max-- > 0)
			{
				sb.append("b");
			}
			System.out.println(sb);
			
			for(int i = 0;i<n;i++)
			{

					if(sb.charAt(arr[i] ) == 'a')
						sb.replace(arr[i],arr[i]+1,"b");
					else
						sb.replace(arr[i],arr[i]+1,"a");
				
					System.out.println(sb);
			
			}
			
			
		}
		sc.close();
	}

}
