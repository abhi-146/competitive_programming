package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Three_Pairwise_Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int arr[] = new int[3];
			for(int i = 0;i<3;i++)
			{
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			
			
			if(arr[1] != arr[2])
				System.out.println("NO");
			else
			{
				System.out.println("YES");
				System.out.println(arr[0]+" "+arr[0]+" "+arr[2]);
			}
				
		}
		sc.close();
	}

}
