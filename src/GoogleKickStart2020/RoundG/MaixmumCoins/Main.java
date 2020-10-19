package GoogleKickStart2020.RoundG.MaixmumCoins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

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
            int n = fr.nextInt();
            int[][] grid = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = fr.nextInt();
                }
            }
            solution(grid, testCase);
        }
    }

    public static void solution(int[][] grid, int testCase) {

        int maximumCoins = 0, n = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }


        System.out.println("Case #" + testCase + ": " + maximumCoins);

    }


    public static int breadthFirstSearch(int[][] grid, int row, int col, boolean[][] visited) {
        int maxProfit = 0;


        return maxProfit;
    }

    public static int[][] directions = {{-1, -1}, {1, 1}};

    public static boolean isValid(int[][] grid, int row, int col) {
        return row >= 0 && row < grid.length && col >= 0 && col < grid[0].length;
    }

}
