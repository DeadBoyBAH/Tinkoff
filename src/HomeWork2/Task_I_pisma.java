package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_I_pisma {

    static public Boolean bs(long x, long k) {
        return x >= k;
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

        long sum = 0;
        long[] array4 = new long[n];
        for (int i = 0; i < n; i++) {

            array4[i] = sum;
            sum += array1[i];
        }

        text = reader.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            array2[i] = Long.parseLong(text[i]);
            int l = 0;
            int r = array4.length;
            while(r - l > 1) {
                int mid = (r + l)/2;
                if(bs(array4[mid], array2[i])) r = mid;
                else l = mid;
            }
            System.out.println(r + " " + (array2[i] - array4[r - 1]));
        }
    }
}
