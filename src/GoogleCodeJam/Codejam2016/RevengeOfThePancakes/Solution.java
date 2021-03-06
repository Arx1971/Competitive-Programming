package GoogleCodeJam.Codejam2016.RevengeOfThePancakes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
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
        for (int i = 1; i <= testCase; i++) {
            String cakes = fr.nextLine();
            pancakeSorting(cakes.toCharArray(), i);
        }
    }

    public static void pancakeSorting(char[] pancakes, int caseNumber) {

        int plusMinusCounter = flipCounter(pancakes, '-', '+');
        int minusPlusCounter = flipCounter(pancakes, '+', '-');

        int group = 1 + plusMinusCounter + minusPlusCounter;

        if (pancakes[pancakes.length - 1] == '-')
            System.out.println("Case #" + caseNumber + ": " + (group));
        else
            System.out.println("Case #" + caseNumber + ": " + (group - 1));
    }

    public static int flipCounter(char[] pancakes, char a, char b) {
        int counter = 0;
        for (int i = 0; i < pancakes.length - 1; i++) {
            if (pancakes[i] == a && pancakes[i + 1] == b) counter++;
        }
        return counter;
    }

}
