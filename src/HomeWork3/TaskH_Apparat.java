package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskH_Apparat {

    public static int dinamyc(String text) {
        int[] dp = new int[text.length() + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 0; i < text.length(); i++) {
            dp[i+1] = dp[i];
            if(text.charAt(i) == 'w' || text.charAt(i) == 'm') {
                return 0;
            }
            if (i != 0 && ((text.charAt(i) == 'n' && text.charAt(i-1) == 'n') || (text.charAt(i) == 'u' && text.charAt(i-1) == 'u'))) {
                dp[i + 1] = (dp[i] + dp[i-1]) % (1_000_000_000+7);
            }
        }
        return dp[text.length()];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        System.out.println(dinamyc(text));

    }
}
