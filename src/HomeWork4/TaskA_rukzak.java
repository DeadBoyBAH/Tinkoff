package HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA_rukzak {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split(" ");
        int n = Integer.parseInt(text[0]);
        int w = Integer.parseInt(text[1]);

        text = reader.readLine().split(" ");
        int[] array = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            array[i] = Integer.parseInt(text[i-1]);
        }

        boolean[][] dp = new boolean[n+1][w+1];
        dp[0][0] = true;

        for (int i = 1; i < w; i++) {
            dp[0][i] = false;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < w+1; j++) {
                if(j - array[i] >= 0) {
                    dp[i][j] = (dp[i-1][j] || dp[i-1][j-array[i]]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        if (dp[n][w]) System.out.println("yes");
        else System.out.println("no");
    }
}
