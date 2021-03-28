package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskF_Kon {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split(" ");
        int n = Integer.parseInt(text[0]);
        int m = Integer.parseInt(text[1]);
        int[][] dp = new int[n][m];

        if (n >= 3 && m >= 3) {
            dp[1][2] = 1;
            dp[2][1] = 1;
        } else if((n == 3 && m == 2) || (n == 2 && m == 3)) dp[n-1][m-1] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i - 2 >= 0 && j - 1 >= 0) {
                    dp[i][j] = dp[i][j] + dp[i-2][j-1] ;
                }
                if(i - 1 >=0 && j - 2 >=0) {
                    dp[i][j] = dp[i][j] + dp[i-1][j-2] ;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(dp[n-1][m-1]);
    }
}
