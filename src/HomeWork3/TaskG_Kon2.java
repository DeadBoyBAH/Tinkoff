package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskG_Kon2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split(" ");
        int n = Integer.parseInt(text[0]);
        int m = Integer.parseInt(text[1]);
        int[][] dp = new int[n][m];

        dp[0][0] = 1;

        for (int j = 0; j < m; j++) {
            int i = 0;
            int k = j;
            while (i < n && k >= 0) {
                if (i - 2 >= 0 && k - 1 >= 0) {
                    dp[i][k] += dp[i - 2][k - 1];
                }
                if (i - 1 >= 0 && k - 2 >= 0) {
                    dp[i][k] += dp[i - 1][k - 2];
                }
                if (i - 2 >= 0 && k + 1 < m) {
                    dp[i][k] += dp[i - 2][k + 1];
                }
                if (i + 1 < n && k - 2 >= 0) {
                    dp[i][k] += dp[i + 1][k - 2];
                }

                i += 1;
                k -= 1;
            }
        }

        for (int i = 1; i < n; i++) {
            int j = m - 1;
            int k = i;
            while (k < n && j >= 0) {
                if (k - 2 >= 0 && j - 1 >= 0) {
                    dp[k][j] += dp[k - 2][j - 1];
                }
                if (k - 1 >= 0 && j - 2 >= 0) {
                    dp[k][j] += dp[k - 1][j - 2];
                }
                if (k - 2 >= 0 && j + 1 < m) {
                    dp[k][j] += dp[k - 2][j + 1];
                }
                if (k + 1 < n && j - 2 >= 0) {
                    dp[k][j] += dp[k + 1][j - 2];
                }

                k += 1;
                j -= 1;
            }
        }

        System.out.println(dp[n - 1][m - 1]);
    }
}
