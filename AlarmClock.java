package codeforces;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlarmClock {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String input[]= br.readLine().split(" ");
			long a = Long.parseLong(input[0]);
			long b = Long.parseLong(input[1]);
			long c = Long.parseLong(input[2]);
			long d = Long.parseLong(input[3]);
			
			System.out.println(time(a,b,c,d));
		}
	}

	private static long time(long a, long b, long c, long d) {
		if(b >= a)
			return b;
		else if(d >= c)
			return -1;
		else
		{
			long count = ((a-b)%(c-d)==0)?(a-b)/(c-d):(a-b)/(c-d)+1;
			long p = (b + c*count);
			return p;
		}
			
	}
	
}
