package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_H_cow {
    static public Boolean f(int x, int[] array, int k) {
        int cows = 1;
        int cow_last = array[0];
        for (int c : array) {
            if(c - cow_last >= x) {
                cows++;
                cow_last = c;
            }
        }
        return cows >= k;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split(" ");
        int n = Integer.parseInt(text[0]);
        int k = Integer.parseInt(text[1]);
        int[] array = new int[n];
        text = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(text[i]);
        }

        int l = 0;
        int r = array[n - 1] - array[0] + 1;
        while(r - l > 1){
            int m = (l + r)/2;
            if(f(m, array, k)) l = m;
            else r = m;
        }

        System.out.println(l);
    }
}
