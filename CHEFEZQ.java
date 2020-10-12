package codechef;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHEFEZQ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(br.readLine().trim());
		
		while(t-- > 0)
		{
			String nk[] = br.readLine().split(" ");
			long n = Long.parseLong(nk[0]);
			long k = Long.parseLong(nk[1]);
			
			String input[] = br.readLine().split(" ");
			long count = 0;
			long rem = 0;
			boolean flag = true;
			
			for(int i = 0;i<n;i++)
			{
				long x = Long.parseLong(input[i]);
				x+=rem;
				rem = 0;
				
				if(x < k)
				{
					System.out.println(count+1);
					flag = false;
					break;
				}
				else
				{
					x-=k;
					rem+=x;
					count++;
				}
			}
			if(flag)
			{
				count +=  rem/k;
				System.out.println(count + 1);
			}
		}

	}

}