package HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskC_rukzak_cost {
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

        text = reader.readLine().split(" ");
        int[] array_cost = new int[n + 1];

        for (int i = 1; i < n+1; i++) {
            array_cost[i] = Integer.parseInt(text[i-1]);
        }

        int[][] dp = new int[n+1][w+1];
        dp[0][0] = 0;

        int sum = 0;
        for (int x : array_cost) {
            sum += x;
        }

        for (int i = 1; i < w+1; i++) {
            dp[0][i] = -sum;
        }

        int[][] dp_opt = new int[n+1][w+1];

        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < w+1; j++) {
                dp[i][j] = dp[i-1][j];
                if(j - array[i] >= 0) {
                    if(dp[i-1][j-array[i]] + array_cost[i] > dp[i][j]) {
                        dp[i][j] = Math.max(dp[i-1][j-array[i]] + array_cost[i], dp[i][j]);
                    }
                }
                if (dp[i][j] == dp[i-1][j]) {
                    dp_opt[i][j] = 0;
                } else if(dp[i][j] == dp[i-1][j-array[i]] + array_cost[i]) {
                    dp_opt[i][j] = 1;
                }
            }
        }
        int max = dp[n][w];
        int m = w;
        for (int i = w - 1; i >= 0 ; i--) {
            if (dp[n][i] > max) {
                max = dp[n][i];
                m = i;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n; i >= 1; i--) {
            if(dp_opt[i][m] == 1) list.add(i);
        }

        System.out.println(list.size());
        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}
