package GoogleKickStart.KickStart2016.RoundD.Vote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int testCase = fr.nextInt();

        for (int tt = 1; tt <= testCase; tt++) {
            int a = fr.nextInt(), b = fr.nextInt();
            solution(a, b, tt);
        }

    }

    public static void solution(int n, int m, int testCase) {
        double ans = 0.0;

        ans = (n - m) / (double) (n + m);

        System.out.println("Case #" + testCase + ": " + ans);
    }

}
