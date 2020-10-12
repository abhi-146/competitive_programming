package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class REPLESX {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
			String nxpk[] = br.readLine().split(" ");
			long n = Long.parseLong(nxpk[0]);
			long x = Long.parseLong(nxpk[1]);
			int p = Integer.parseInt(nxpk[2]);
			int k = Integer.parseInt(nxpk[3]);
			
			String input[] = br.readLine().split(" ");
			
			long arr[] = new long[(int)n];
			for(int i = 0;i<n;i++)
			{
				arr[i] = Long.parseLong(input[i]);
			}
			
			Arrays.sort(arr);
			
//			long indx = Arrays.binarySearch(arr, x);
			int index = findIndex(arr,n,x,p,k);
			int count = 0;
			
			if(arr[index] != x)
			{
				arr[k-1] = x;
				Arrays.sort(arr);
				count++;
			}
			if(arr[p-1] == x)
			{
				System.out.println(count);
				continue;
			}
			if(p<k && arr[p-1] < x)
			{
				System.out.println("-1");
				continue;
			}
			if(p>k && arr[p-1] > x)
			{
				System.out.println("-1");
				continue;
			}
			index = findIndex(arr,n,x,p,k);
			index++;
			System.out.println(Math.abs(p-index)+count);

		}

	}

	private static int findIndex(long[] arr, long n, long x, long p, long k) {
		int min = (int)1e8;
		int pos = 0;
		
		for(int i = 0;i<n;i++)
		{
			if(arr[i] == x)
			{
				if(Math.abs(p-i) < min)
				{
					min = (int) Math.abs(p - i);
					pos = i;
				}
			}
		}
		
		return pos;
	}

}
