package codeforces;
import java.util.*;


public class Team {

	public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int t = sc.nextInt();
       int count = 0;
       while(t-->0)
       {
    	   int arr[] = new int[3];
    	   for(int i=0;i<3;i++)
    		   arr[sc.nextInt()]++;
    	   if(arr[1]>=2)
    		   count++;
       }
       System.out.print(count);
       sc.close();
	}

}
