package codeforces;
import java.util.Scanner;

public class Brain_photos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int i,j,flag=0;
		char matrix[][]=new char[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				matrix[i][j]=sc.next().charAt(0);
				if(matrix[i][j]=='C'||matrix[i][j]=='M'||matrix[i][j]=='Y')
					flag=1;
			}
			
		}
		if(flag==1)
			System.out.println("#Color");
		else
			System.out.println("#Black&White");
		sc.close();
		}

}
