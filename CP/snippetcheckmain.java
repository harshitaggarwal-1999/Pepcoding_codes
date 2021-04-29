import java.util.*;
import java.io.*;

import static java.lang.Math.*;

public class snippetcheckmain
{
    static MyScanner scan;
    static PrintWriter pw;
    static long MOD = 1_000_000_007;
    static long INF = 2_000_000_000_000_000_000L;
    static long inf = 2_000_000_000;

    static void initIo(boolean isFileIO, String suffix) throws IOException {
        scan = new MyScanner(isFileIO, suffix);
        if(isFileIO) {
            pw = new PrintWriter("C:/Users/DELL/Desktop/pepcoding/CP/output.txt");
        }
        else {
            pw = new PrintWriter(System.out);
        }
    }
    static int ni() throws IOException
    {
        return scan.nextInt();
    }
    static long nl() throws IOException
    {
        return scan.nextLong();
    }
    static double nd() throws IOException
    {
        return scan.nextDouble();
    }
    static String ne() throws IOException
    {
        return scan.next();
    }
    static String nel() throws IOException
    {
        return scan.nextLine();
    }
    static void pl()
    {
        pw.println();
    }
    static void p(Object o)
    {
        pw.print(o+" ");
    }
    static void pl(Object o)
    {
        pw.println(o);
    }
    static void psb(StringBuilder sb)
    {
        pw.print(sb);
    }
    static void pa(Object arr[])
    {
        for(Object o : arr)
            p(o);
        pl();
    }
    static void pa(int arr[])
    {
        
        for(int o : arr)
            p(o);
        pl();
    }
    static void pa(long arr[])
    {
        for(long o : arr)
            p(o);
        pl();
    }
    static void pa(double arr[])
    {
        for(double o : arr)
            p(o);
        pl();
    }
    static void pa(char arr[])
    {
        for(char o : arr)
            p(o);
        pl();
    }
    static void pa(boolean arr[])
    {
        for(boolean o : arr)
            p(o);
        pl();
    }
    static void pa(List list)
    {
        for(Object o : list)
            p(o);
        pl();
    }
    static void pa(Object[][] arr) {
        for(int i=0;i<arr.length;++i) {
            for(Object o : arr[i])
                p(o);
            pl();
        }
    }
    static void pa(int[][] arr) {
        for(int i=0;i<arr.length;++i) {
            for(int o : arr[i])
                p(o);
            pl();
        }
    }
    static void pa(long[][] arr) {
        for(int i=0;i<arr.length;++i) {
            for(long o : arr[i])
                p(o);
            pl();
        }
    }
    static void pa(char[][] arr) {
        for(int i=0;i<arr.length;++i) {
            for(char o : arr[i])
                p(o);
            pl();
        }
    }
    static void pa(double[][] arr) {
        for(int i=0;i<arr.length;++i) {
            for(double o : arr[i])
                p(o);
            pl();
        }
    }
    static void pa(boolean[][] arr) {
        for(int i=0;i<arr.length;++i) {
            for(boolean o : arr[i])
                p(o);
            pl();
        }
    }
    static class MyScanner
    {
        BufferedReader br;
        StringTokenizer st;
        MyScanner(boolean readingFromFile, String suffix) throws IOException
        {
            if(readingFromFile) {
                br = new BufferedReader(new FileReader("C:/Users/DELL/Desktop/pepcoding/CP/"+suffix+".txt"));
            }
            else {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
        }
        String nextLine()throws IOException
        {
            return br.readLine();
        }
        String next() throws IOException
        {
            if(st==null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        int nextInt() throws IOException
        {
            return Integer.parseInt(next());
        }
        long nextLong() throws IOException
        {
            return Long.parseLong(next());
        }
        double nextDouble() throws IOException
        {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args)throws Exception {
        initIo(true, "input");
        // initIo(false, "");
        int t = ni();
        while(t-- > 0){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < 5; i++){
                int in = ni();
                list.add(in);
            }
            pl(list);
        }
    }


    static void solve() throws java.lang.Exception {       
        
        
        
    }
}