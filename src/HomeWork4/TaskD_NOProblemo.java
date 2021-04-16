package HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskD_NOProblemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] text = reader.readLine().split(" ");
        int[] array_1 = new int[n];

        for (int i = 0; i < n; i++) {
            array_1[i] = Integer.parseInt(text[i]);
        }

        int m = Integer.parseInt(reader.readLine());
        text = reader.readLine().split(" ");
        int[] array_2 = new int[m];

        for (int i = 0; i < m; i++) {
            array_2[i] = Integer.parseInt(text[i]);
        }

        int[][] dp = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                if(array_1[i-1] == array_2[j-1]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + 1);
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}
