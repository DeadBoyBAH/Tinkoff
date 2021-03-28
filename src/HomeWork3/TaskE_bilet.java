package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskE_bilet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] t = new int[n + 1];
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
        int[] c = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            String[] text = reader.readLine().split(" ");
            a[i] = Integer.parseInt(text[0]);
            b[i] = Integer.parseInt(text[1]);
            c[i] = Integer.parseInt(text[2]);
        }

        t[0] = 0;
        t[1] = a[1];
        if (n > 1) {
            t[2] = Math.min(t[1] + a[2], t[0] + b[1]);
        }


        for (int i = 3; i <= n; i++) {
            t[i] = Math.min(t[i - 1] + a[i], Math.min(t[i-2]  + b[i-1], t[i-3] + c[i-2]));
        }

        System.out.println(t[n]);
    }
}
