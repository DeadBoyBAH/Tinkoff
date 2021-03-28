package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TaskH_gvozdi {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] text = reader.readLine().split(" ");
        int[] coord = new int[n];

        for (int i = 0; i < n; i++) {
            coord[i] = Integer.parseInt(text[i]);
        }

        Arrays.sort(coord);

        int[] dp = new int[n - 1];
        dp[0] = coord[1] - coord[0];
        if(n > 2) dp[1] = coord[2] - coord[0];

        for (int i = 2; i < n - 1; i++) {
            dp[i] = Math.min(dp[i-1], dp[i-2]) + coord[i+1] - coord[i];
        }

        System.out.println(dp[n - 2]);
    }
}
