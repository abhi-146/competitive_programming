package codeforces;

import java.util.Scanner;
import java.util.Stack;

public class Move_Brackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var t = sc.nextInt();
		
		while(t-- > 0)
		{
			var n = sc.nextInt();
			sc.nextLine();
			
			var str = sc.nextLine();
			
			var open = 0;
			var close = 0;
			
			var st = new Stack<Character>();
		
			for(var i = 0;i<n;i++)
			{
				if(st.isEmpty())
				{
					st.add(str.charAt(i));
					
					if(str.charAt(i) == '(')
						open++;
					else
						close++;
					
					
				}
				else if(str.charAt(i) == '(')
				{
				
						st.add('(');
						open++;
					
				}
				else
				{
					if(st.peek() == '(')
					{
						st.pop();
						open--;
					}
						
					else
					{
						st.add(')');
						close++;
					}

				}
				
			}System.out.println(Math.min(open,close));
		}
		sc.close();
		
	}

}
