package codeforces;

import java.io.BufferedReader;
import static  java.lang.System.out;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TernaryString {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String input= br.readLine();
			int len = input.length();
			
			Map<Character,Integer> m = new HashMap<Character,Integer>();
			int start = 0;int end = 0;
			int min_length=Integer.MAX_VALUE;
			boolean flag = false;
			while(end<len)
			{
				char current = input.charAt(end);
				m.put(current,m.getOrDefault(current, 0)+1);
				
				while(m.size()==3)
				{
					if(m.size()==3)
						flag = true;
					min_length = Math.min(end-start+1, min_length);
					char front = input.charAt(start);
					m.put(front, m.get(front)-1);
					
					if(m.get(front)  == 0)
						m.remove(front);
					
					start++;
					
					}
				end++;
			}
			if(flag)
			out.println(min_length);
			else
				out.println("0");
			
		}
		
	}
	
}

	