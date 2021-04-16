package HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TaskE_NVP_vost {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] text = reader.readLine().split(" ");
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(text[i]);
        }

        int[] dp = new int[n];
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            p[i] = -1;
            for (int j = 0; j < i; j++) {
                if(array[j] < array[i]) {
                    if(1 + dp[j] > dp[i]) {
                        dp[i] = 1 + dp[j];
                        p[i] = j;
                    }

                }
            }
        }

        int max = dp[0];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if(dp[i] > max) {
                max = dp[i];
                pos = i;
            }
        }

        List<Integer> list = new ArrayList<>();
        while(pos != -1) {
            list.add(pos);
            pos = p[pos];
        }

        System.out.println(max);
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(array[list.get(i)] + " ");
        }
    }
}
