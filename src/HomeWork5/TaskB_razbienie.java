package HomeWork5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TaskB_razbienie {

    static int[] a = new int[100];
    static int p = 0;

    static void rec(int n, int k, int i, long[] a1, long[][] a2) {
        if ( n < 0 ) return;
        if ( n == 0 ) {
            int j;
            Arrays.fill(a1, 0);
            for (j = 0; j < i; j++) {
                a1[j] = a[j];
            }
            for (int l = 0; l < a1.length; l++) {
                if (a1[l] != 0) a2[p][l] = a1[l];
                else break;
            }
            p++;

        } else {
            if ( n - k >= 0) {
                a[i] = k;
                rec(n - k, k, i + 1, a1, a2);
            }

            if ( k - 1 > 0) {
                rec(n, k - 1, i,a1, a2);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("partition.in");
        FileReader fr = new FileReader(file);

        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        int n = Integer.parseInt(line);
        int i;
        long[] a1 = new long[n];
        long[][] a2 = new long[40000][n];
        for (i = 0; i <= n; i++) {
            a[i] = 0;
        }
        rec(n, n, 0, a1, a2);

        FileWriter fw = new FileWriter(new File("partition.out"));
        boolean proverka = false;
        for (int j = a2.length - 1; j >= 0; j--) {
            for (int k = 0; k < a2[j].length; k++) {
                if(a2[j][k] != 0) {
                    fw.write(a2[j][k] + " ");
                    fw.flush();
                    proverka = true;
                }
            }
            if (proverka)
            fw.write("\n");
            fw.flush();
        }

    }
}
