package codeforces;

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Puzzles {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        main solver = new main();
        solver.solve(in, out);
        out.close();
    }

    static class main {
        public void solve(FastScanner in, PrintWriter out) {
        	int n = in.nextInt();
        	int m = in.nextInt();
        	
        	int arr[] = in.nextIntArray(m);
        	
        	Arrays.parallelSort(arr);
        	
        	int min = Integer.MAX_VALUE;
        	
        	for(int i = 0;i<= m - n;i++)
        	{
        		min = Math.min(min, Math.abs(arr[i]-arr[i + n - 1]));
        	}
        	if(min != Integer.MAX_VALUE)
        	out.print(min);
        	else
        		out.print(Math.abs(arr[0] - arr[n - 1]));
        	
        	
        	
        	
        }

    }

    static class FastScanner {
        public BufferedReader br;
        public StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        public int[] nextIntArray(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

    }
}


