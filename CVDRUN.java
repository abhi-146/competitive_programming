package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CVDRUN {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			int x = Integer.parseInt(input[2]);
			int y = Integer.parseInt(input[3]);
			int start = x;
			if(x == y)
				System.out.println("YES");
			else if(k > 0)
				System.out.println(check(n,k,x,y,start));
			else
				System.out.println("NO");
		}
	}

	private static String check(int n, int k, int x, int y,int start) {
		x = (x+k)%n;
		if(x == y)
			return "YES";
		else if(x == start)
			return "NO";
		else
			return check(n,k,x,y,start);
	}

}
