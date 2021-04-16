package HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskC_rukzak_cost_2 {

    public static int maxArray(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max ) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split(" ");
        int n = Integer.parseInt(text[0]);
        int w = Integer.parseInt(text[1]);

        text = reader.readLine().split(" ");
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(text[i]);
        }

        text = reader.readLine().split(" ");
        int[] array_cost = new int[n + 1];

        for (int i = 0; i < n; i++) {
            array_cost[i] = Integer.parseInt(text[i]);
        }

        int[][] dp = new int[n + 1][w + 1];
        dp[0][0] = 0;
        int[][] dp_opt = new int[n + 1][w + 1];
        dp_opt[0][0] = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= array[i - 1]) {
                    if (dp[i - 1][j - array[i - 1]] + array_cost[i - 1] > dp[i][j]) {
                        dp[i][j] = Math.max(dp[i-1][j - array[i-1]] + array_cost[i-1], dp[i][j]);
                    }
                }
                if(dp[i][j] == dp[i-1][j]) {
                    dp_opt[i][j] = 0;
                } else if(dp[i][j] == dp[i-1][j - array[i-1]] + array_cost[i-1]) {
                    dp_opt[i][j] = 1;
                }
            }
        }

        List<Integer> array_final = new ArrayList();

        int startI = n;
        int startJ = 0;
        for (int i = 0; i < w+1; i++) {
            if(dp[startI][i] == maxArray(dp[startI])) {
                startJ = i;
            }
        }

        while(startI != 0) {
            if(dp_opt[startI][startJ] == 0) {
                startI -= 1;
            } else if(dp_opt[startI][startJ] == 1) {
                array_final.add(startI);
                startI -= 1;
                startJ = startJ - array[startI];
            }
        }

        System.out.println(array_final.size());
        for (int x : array_final) {
            System.out.print(x + " ");
        }

    }
}
