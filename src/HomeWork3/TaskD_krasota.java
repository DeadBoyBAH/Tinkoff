package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskD_krasota {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split(" ");
        int n = Integer.parseInt(text[0]);
        int x = Integer.parseInt(text[1]);
        int[] array = new int[n];

        text = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(text[i]);
        }

        int[] dp = new int[n];
        int sum_pr = array[0];
        dp[0] = sum_pr;

        for (int i = 1; i < n; i++) {
            sum_pr += array[i];
            dp[i] = sum_pr;
        }

        for (int a : dp) {
            System.out.print(a + " ");
        }

    }
}
