package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_I_pisma {
    static public long[] f(long x, long[] array) {
        long kvartira = array[0];
        long dom = 1;
        long[] array2 = new long[2];
        for (int i = 1; i < array.length; i++) {
            if(kvartira < x) {
                if(kvartira + array[i] < x) {
                    kvartira += array[i];
                    dom += 1;
                }
                else {
                    dom += 1;
                    array2[0] = dom;
                    array2[1] = x - kvartira;
                    break;
                }

            } else {
                array2[0] = dom;
                array2[1] = x;
                break;
            }
        }
        return array2;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split(" ");
        int n = Integer.parseInt(text[0]);
        int m = Integer.parseInt(text[1]);

        long[] array1 = new long[n];
        long[] array2 = new long[m];
        
        text = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            array1[i] = Long.parseLong(text[i]);
        }

        text = reader.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            array2[i] = Long.parseLong(text[i]);
            long[] array3 = f(array2[i], array1);
            for (long x : array3) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
