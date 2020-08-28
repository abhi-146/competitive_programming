package codeforces;

import java.util.Scanner;

public class Bus_to_Udayland {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[n];
		boolean status = false;
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextLine();
			
			if(!status)
			{
				if(arr[i].contains("OO"))
				{
					arr[i] = arr[i].replaceFirst("OO", "++");
					status = true;
				}
			}
		}
		if(status)
			{
				System.out.println("YES");
				for(int i = 0;i<n;i++)
				{
					System.out.println(arr[i]);
				}
			}
		else
			System.out.println("NO");
	}

}
