package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskC_cherepashka {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] razmer = reader.readLine().split(" ");
        int n = Integer.parseInt(razmer[0]);
        int m = Integer.parseInt(razmer[1]);
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] text = reader.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                array[i][j] = Integer.parseInt(text[j]);
            }
        }

        int[][] dp = new int[n][m];
        char[][] opt = new char[n][m];
        dp[0][0] = array[0][0];
        opt[0][0] = 'D';

        for (int i = 1; i < m; i++) {
            dp[0][i] = dp[0][i -1] + array[0][i];
            opt[0][i] = 'R';
        }

        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i -1][0] + array[i][0];
            opt[i][0] = 'D';
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(dp[i-1][j] >= dp[i][j-1]) {
                    dp[i][j] = dp[i-1][j] + array[i][j];
                    opt[i][j] = 'D';
                } else {
                    dp[i][j] = dp[i][j-1] + array[i][j];
                    opt[i][j] = 'R';
                }
            }
        }

        char[] array_opt = new char[n + m - 2];

        int a = n - 1;
        int b = m - 1;

        for (int i = 0; i < n + m - 2; i++) {
            if(a >= 0 && b >= 0) {
                if (opt[a][b] == 'D') {
                    a -= 1;
                    array_opt[i] = 'D';
                } else {
                    b -= 1;
                    array_opt[i] = 'R';
                }
            }
        }

        System.out.println(dp[n-1][m-1]);
        for (int i = n + m - 3; i >= 0; i--) {
            System.out.print(array_opt[i] + " ");
        }
    }
}
