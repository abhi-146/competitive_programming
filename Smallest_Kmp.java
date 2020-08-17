package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Smallest_Kmp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String s1,s2;
			StringBuffer s = new StringBuffer("");
			StringBuffer str = new StringBuffer("");
			
			s1 = br.readLine();
			s2 = br.readLine();
			
			long n = s1.length();
			long m = s2.length();
			
			long arr[] = new long[27];
			Arrays.fill(arr, 0);
			
			long arr1[] = new long[27];
			
			for(int i = 0;i<n;i++)
			{
				arr[s1.charAt(i) - 'a']++;
			}
			
			for(int i = 0;i<m;i++)
			{
				arr[s2.charAt(i) - 'a']--;
			}
			
			for(int i = 0;i<26;i++)
			{
				arr1[i] = arr[i];
			}
			
			for(int i = 0;i<=s2.charAt(0)-'a';i++)
			{
				while(arr[i]-- > 0)
				{
					char c = (char)(i + 97);
					
					s.append(String.valueOf(c));
				}
			}
			s.append(s2);
			
			for(int i = 0;i<26;i++)
			{  
				while(arr[i]-- > 0)
				{
					char c = (char)(i + 97);
					s.append(String.valueOf(c));
				}
			}
			
			
			for(int i = 0;i<s2.charAt(0)-'a';i++)
			{
				while(arr1[i]-- > 0)
				{
					str.append((char)(i + 97));
				}
			}
			str.append(s2);
			
			for(int i = 0;i<26;i++)
			{
				while(arr1[i]-- > 0)
				{
					str.append((char)(i + 97));
				}
			}
			
			if(s.toString().compareTo(str.toString()) > 0)
			{
				System.out.println(str.toString());
			}
			else
			{
				System.out.println(s.toString());
			}
			System.out.println();
			
		}
	}

}
