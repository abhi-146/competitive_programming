package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DDIMMST {
	
	
	static class Edge
	{
		int src;
		int dest;
		long weight;
		
		Edge(int src,int dest,long weight)
		{
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
	}
	
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nd[] = br.readLine().split(" ");
	
		int n = Integer.parseInt(nd[0]);
		int d = Integer.parseInt(nd[1]);
		
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();		
		for(int i = 0;i<n;i++)
		{
			String str[] = br.readLine().split(" ");
			ArrayList<Integer> values = new ArrayList<>();
			
			for(int k = 0 ;k<str.length;k++)
			{
				values.add(Integer.parseInt(str[k]));
			}
			list.add(values);
			
		}
		ArrayList<Edge> edges = new ArrayList<>();
		
		for(int i = 0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				long weight = (diff(list.get(i),list.get(j)));
				Edge curr = new Edge(i,j,weight);
				edges.add(curr);
			}
		}
		
		
		
		
		
//		for(int i = 0;i<n;i++)
//		{
//			for(int j = i+1;j<n;j++)
//			{
//				long weight = (diff(list.get(i),list.get(j)));
//				al[i].add(new pair(j,weight));
//				al[j].add(new pair(i,weight));
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		long graph[][] = new long[n][n];
		
		for(int i = 0;i<edges.size();i++)
		{
			graph[edges.get(i).src][edges.get(i).dest] = edges.get(i).weight;
			graph[edges.get(i).dest][edges.get(i).src] = edges.get(i).weight;
//			System.out.println(edges.get(i).src+" "+edges.get(i).dest+" "+edges.get(i).weight);
		}
//		for(int i = 0;i<n;i++)
//		{
//			for(int j = 0;j<n;j++)
//			{
//				
//				System.out.print(graph[i][j]);
//			}
//			System.out.println(">>");
//		}
		
		primMST(graph);
		
		
		
	}
			

	private static long diff(ArrayList<Integer> x,ArrayList<Integer> y) {
	
		long diff = 0;
		
		for(int i = 0;i<x.size();i++)
		{
			diff += Math.abs(x.get(i) - y.get(i));
		}
		
		return diff;
	}
	
	static void primMST(long graph[][])
	{
		int v = graph.length;
//		System.out.println("v "+v);
		
		
		int parent[] = new int[v];
		long key[] = new long[v];
		boolean mstSet[] = new boolean[v];
		
		for(int i = 0;i<v;i++)
		{
			key[i] = Integer.MIN_VALUE;
			mstSet[i] = false;
		}
		
		key[0] = 0;
		parent[0] = -1;
		
		for(int count = 0;count < v-1;count++)
		{
			long u = maxKey(key,mstSet,v);
			mstSet[(int) u] = true;
//			System.out.println("u "+u);
			
			for(int j = 0;j < v;j++)
			{
				if (graph[(int) u][j] != 0 && mstSet[j] == false && graph[(int) u][j] > key[j]) {
                    parent[j] = (int) u;
                    key[j] = graph[(int) u][j];
				}
			}
			
		}
		printMST(parent, graph, v);
//		printMST0(parent, graph);
		
	}


	private static void printMST(int[] parent, long[][] graph, int v) {
		
		long sum = 0;
		for (int i = 1; i < v; i++)
		{ 	
			sum+=graph[parent[i]][i];
			
		}
		
		System.out.println(sum);
	}
	
	 static void printMST0(int parent[], long graph[][])
	    {
	        System.out.println("Edge \tWeight");
	        for (int i = 1; i < graph.length; i++)
	            System.out.println(parent[i] + " - " + i + "\t" + graph[parent[i]][i]);
	    }


	private static long maxKey(long[] key, boolean[] mstSet, int v) {
		long max = Integer.MIN_VALUE;
		int index = -1;
		
		for(int i = 0;i < v;i++)
		{
			if (mstSet[i] == false && key[i] > max) {
//				System.out.println("key "+key[i]);
                max = key[i];
                index = i;
			}
		}
		return index;
	}

}
//
//
//
//

//
//
// import java.io.IOException;
//import java.io.InputStream;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.InputMismatchException;
//import java.util.PriorityQueue;
// 
// 
// 
//public class DDIMMST {
//	static ArrayList al[];
//	static int id[];
//	static boolean visited[];
//	static class pair implements Comparable<pair>
//	{
//		Integer y;Long weight;
//		pair(int y,long weight)
//		{
//			this.y=y;
//			this.weight=weight;
//		}
//		public int compareTo(pair o) {
//			return o.weight.compareTo(weight);
//		}  
//	}
//public static void main(String args[])
//{
//	InputReader in=new InputReader(System.in);
//	PrintWriter w=new PrintWriter(System.out);
//
//	int n=in.nextInt();
//	int d=in.nextInt();
//	
//	ArrayList<ArrayList<Integer>> list = new ArrayList<>();		
//		for(int i = 0;i<n;i++)
//		{
//			String str[] = in.nextLine().split(" ");
//			ArrayList<Integer> values = new ArrayList<>();
//			
//			for(int k = 0 ;k<str.length;k++)
//			{
//				values.add(Integer.parseInt(str[k]));
//			}
//			list.add(values);
//			
//		}
//		
//	al=new ArrayList[n+1];
//	for(int i=0;i<=n;i++)
//		al[i]=new ArrayList<pair>();
//		
//		
//	for(int i = 0;i<n;i++)
//		{
//			for(int j = i+1;j<n;j++)
//			{
//				long weight = (diff(list.get(i),list.get(j)));
//				al[i].add(new pair(j,weight));
//				al[j].add(new pair(i,weight));
//			}
//		}
//	
//	
//	
//	visited=new boolean[n+1];
//	PriorityQueue<pair> q=new PriorityQueue<pair>();
//	q.add(new pair(1,0));
//	int cost=0,num=n;
//	while(num!=0)
//	{
//		pair p=q.poll();
//		if(visited[p.y])
//			continue;
//		visited[p.y]=true;
//		num--;
//		//System.out.println(p.weight);
//		for(int i=0;i<al[p.y].size();i++)
//		{
//			pair temp=(pair) al[p.y].get(i);
//			
//			if(!visited[temp.y])
//			{
//				//System.out.println(p.y+" "+temp.y+" "+temp.weight);
//				q.add(temp);
//			}
//		}
//		
//		cost+=p.weight;
//	}
//	System.out.println(cost);
//	
//}
//private static long diff(ArrayList<Integer> x,ArrayList<Integer> y) {
//	
//		long diff = 0;
//		
//		for(int i = 0;i<x.size();i++)
//		{
//			diff += Math.abs(x.get(i) - y.get(i));
//		}
//		
//		return diff;
//	}
//	
// 
//static class InputReader {
//	 
//	private final InputStream stream;
//	private final byte[] buf = new byte[8192];
//	private int curChar, snumChars;
//	private SpaceCharFilter filter;
// 
//	public InputReader(InputStream stream) {
//		this.stream = stream;
//	}
// 
//	public int snext() {
//		if (snumChars == -1)
//			throw new InputMismatchException();
//		if (curChar >= snumChars) {
//			curChar = 0;
//			try {
//				snumChars = stream.read(buf);
//			} catch (IOException e) {
//				throw new InputMismatchException();
//			}
//			if (snumChars <= 0)
//				return -1;
//		}
//		return buf[curChar++];
//	}
// 
//	public int nextInt() {
//		int c = snext();
//		while (isSpaceChar(c)) {
//			c = snext();
//		}
//		int sgn = 1;
//		if (c == '-') {
//			sgn = -1;
//			c = snext();
//		}
//		int res = 0;
//		do {
//			if (c < '0' || c > '9')
//				throw new InputMismatchException();
//			res *= 10;
//			res += c - '0';
//			c = snext();
//		} while (!isSpaceChar(c));
//		return res * sgn;
//	}
// 
//	public long nextLong() {
//		int c = snext();
//		while (isSpaceChar(c)) {
//			c = snext();
//		}
//		int sgn = 1;
//		if (c == '-') {
//			sgn = -1;
//			c = snext();
//		}
//		long res = 0;
//		do {
//			if (c < '0' || c > '9')
//				throw new InputMismatchException();
//			res *= 10;
//			res += c - '0';
//			c = snext();
//		} while (!isSpaceChar(c));
//		return res * sgn;
//	}
// 
//	public int[] nextIntArray(int n) {
//		int a[] = new int[n];
//		for (int i = 0; i < n; i++) {
//			a[i] = nextInt();
//		}
//		return a;
//	}
// 
//	public String readString() {
//		int c = snext();
//		while (isSpaceChar(c)) {
//			c = snext();
//		}
//		StringBuilder res = new StringBuilder();
//		do {
//			res.appendCodePoint(c);
//			c = snext();
//		} while (!isSpaceChar(c));
//		return res.toString();
//	}
// 
//	public String nextLine() {
//		int c = snext();
//		while (isSpaceChar(c))
//			c = snext();
//		StringBuilder res = new StringBuilder();
//		do {
//			res.appendCodePoint(c);
//			c = snext();
//		} while (!isEndOfLine(c));
//		return res.toString();
//	}
// 
//	public boolean isSpaceChar(int c) {
//		if (filter != null)
//			return filter.isSpaceChar(c);
//		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
//	}
// 
//	private boolean isEndOfLine(int c) {
//		return c == '\n' || c == '\r' || c == -1;
//	}
// 
//	public interface SpaceCharFilter {
//		public boolean isSpaceChar(int ch);
//	}
//}
//}
//
