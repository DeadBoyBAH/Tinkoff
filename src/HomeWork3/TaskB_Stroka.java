package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskB_Stroka {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] dp = new int[n + 3];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;

        for (int i = 3; i < n; i++) {
            dp[i] = dp[i-1] + dp[i - 2] + dp[i - 3];
        }

        switch (n){
            case 1:
                System.out.println(2);
                break;

            case 2:
                System.out.println(4);
                break;

            case 3:
                System.out.println(7);
                break;

            default:
                System.out.println(dp[n-1] + dp[n-2] + dp[n - 3]);
                break;
        }
    }
}
