package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proba {
    public static void set_diag(int[][] dp, int i, int j, int n) {
        while (i < n && j >= 0) {
            dp[i][j] += dp[i-2][j - 1] + dp[i-1][j-2] + dp[i - 2][j + 1] + dp[i + 1][j - 2];
            i += 1;
            j -= 1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split(" ");
        int n = Integer.parseInt(text[0]);
        int m = Integer.parseInt(text[1]);
        int[][] dp = new int[n][m];

        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            set_diag(dp, 0, i, n);
        }

        for (int i = 1; i < n; i++) {
            set_diag(dp, i, m-1, n);
        }

        System.out.println(dp[n-1][m-1]);
    }
}
