package codeforces;

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[5];
		while(n-- > 0)
		{
			arr[sc.nextInt()]++;
		}
		int taxi = 0;
		taxi+=arr[4];
		taxi+=arr[2]/2;
		arr[2] = (arr[2] & 1) == 0 ? 0 : 1;
		taxi+=Math.min(arr[1], arr[3]);
		if(arr[1] >= arr[3] )
		{
			arr[1]-=arr[3];
			arr[3] = 0;
		}
		else
		{ 
			arr[3]-=arr[1];
			arr[1] = 0;
		}
		if(arr[3] != 0)
		{
			taxi+=arr[3]; 
			arr[3] = 0;
		}
		if(arr[1]>0 && arr[2] == 1)
		{
			taxi+=1;
			arr[2] = 0;
			arr[1]-= 2;
			
		}
		if(arr[1]>0)
		{
			taxi+=arr[1]%4==0?arr[1]/4:arr[1]/4+1;
		}
		if(arr[2]>0)
			taxi+=arr[2];
		
		
		System.out.print(taxi);

	}

}
