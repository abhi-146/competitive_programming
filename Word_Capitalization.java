package codeforces;
import java.util.Scanner;

public class Word_Capitalization {
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
			StringBuffer sb = new StringBuffer(sc.nextLine());
			System.out.println(sb.substring(0,1).toUpperCase()+sb.substring(1));
			sc.close();

		}

	}


