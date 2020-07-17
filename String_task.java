package codeforces;

import java.util.Scanner;

public class String_task {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().trim();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='o'||ch=='y'||ch=='e'||ch=='u'||ch=='i')
				continue;
			else
				System.out.print("."+ch);
		}

       sc.close();
	}

}
