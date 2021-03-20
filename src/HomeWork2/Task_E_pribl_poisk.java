package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_E_pribl_poisk {
    static public String f(int i, int x) {
        if(i <= x) return "Yes";
        else return "No";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split(" ");
        int n = Integer.parseInt(text[0]);
        int k = Integer.parseInt(text[1]);
        int[] array1 = new int[n];
        int[] array2 = new int[k];

        String[] text2 = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            array1[i] = Integer.parseInt(text2[i]);
        }

        text2 = reader.readLine().split(" ");
        for (int i = 0; i < k; i++) {
            array2[i] = Integer.parseInt(text2[i]);
            int l = -1;
            int r = n;
            while(r - l > 1) {
                int m = (r + l)/2;
                if(!f(array1[m], array2[i]).equals("No")) l = m;
                else r = m;
            }
            if(l != array1.length - 1 && l != -1) {
                if (array2[i] - array1[l] <= array1[l + 1] - array2[i]) System.out.println(array1[l]);
                else System.out.println(array1[l + 1]);
            } else if(l != -1)System.out.println(array1[l]);
            else System.out.println(array1[0]);
        }
    }
}
