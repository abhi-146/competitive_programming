package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class VILLNET {
	
//	static int grid[][] = new int[201][201];
	static boolean visited[][] = new boolean[10001][10001];
	
	static boolean found = false;
	static long count = 0;
	
	static long curr = 1;
	static long next = 0;
	
	static Queue<Long> rq = new LinkedList<>();
	static Queue<Long> cq = new LinkedList<>();
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
			
			
		{
			String input[] = br.readLine().split(" ");
			long x1 = Long.parseLong(input[0]);
			long y1 = Long.parseLong(input[1]);
			long x2 = Long.parseLong(input[2]);
			long y2 = Long.parseLong(input[3]);
			
			rq.add(x1);
			cq.add(y1);
			
			visited[(int) x1][(int) y1] = true;
			
			while(rq.size() > 0)
			{
				
				long x = rq.remove();
				long y = cq.remove();
				
				
				visited[(int) x][(int) y] = true;
				
				
				if(x == x2 && y == y2)
				{
					found = true;
					break;
				}
				
				
				explore_neighbours(x,y);
				 
				curr--;
				
				
				if( curr == 0)
				{
					curr = next;
					next = 0;
					count++;
				}
				
				
				
			}
			System.out.println(count);
			
			found = false;
			count = 0;
					
			curr = 1;
			next = 0;
			
			rq.clear();
			cq.clear();

			
		}
		
	}


	private static void explore_neighbours(long x, long y) {
		
		north(x,y);
		south(x,y);
		east(x,y);
		west(x,y);
		
	}


	private static void west(long x, long y) {
		long xx = x - 2*y;
		
		if(found)
			return;
		
		if(xx < 0 || xx > 10000 || y > 10000)
			return;
		if(visited[(int) xx][(int) y])
			return;
		
		rq.add(xx);
		cq.add(y);
		
		next++;
		
		
	}


	private static void east(long x, long y) {
		long xx = x + 2*y;
		
		if(xx < 0 || xx > 10000 || y > 10000)
			return;
		if(visited[(int) xx][(int) y])
			return;
		if(found)
			return;
		rq.add(xx);
		cq.add(y);
		
		next++;
		
	}


	private static void south(long x, long y) {
		
		long yy = 0;
		long xx = 0;
		
		if(found)
			return;
		
		if(y - 2*x > 0)
		{
			 xx = x;
			 yy = y - 2*x;
		}
		else
		{
			 xx = -x;
			 yy = -(y - 2*x);
		}
		if(xx < 0 || xx > 10000 || yy > 10000)
			return;
		if(visited[(int) xx][(int) yy])
			return;
		
		rq.add(xx);
		cq.add(yy);
		
		next++;
		
	}


	private static void north(long x, long y) {
		long yy = 0;
		long xx = 0;
		
		if(found)
			return;
		
		if(y + 2*x > 0)
		{
			 xx = x;
			 yy = y + 2*x;
		}
		else
		{
			 xx = -x;
			 yy = -(y+2*x);
		}
		if(xx < 0 || xx > 10000 || yy > 10000)
			return;
		if(visited[(int) xx][(int)yy])
			return;
		
		rq.add(xx);
		cq.add(yy);
		
		next++;
		
	}
	
	}
