package Tasks_13_03_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_E {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine());
            String[] stroka = reader.readLine().split(" ");
            int[] array = new int[n];
            int[] odd = new int [n];
            int odd_el = 0;
            int[] ever = new int[n];
            int ever_el = 0;
            boolean proverka = false;
            for (int j = 0; j < n; j++) {
                array[j] = Integer.parseInt(stroka[j]);
                if(array[j] % 2 == 0) ever[ever_el++] = array[j];
                else odd[odd_el++] = array[j];
            }
            if(odd_el % 2 == 0) proverka = true;
            else {
                for (int j = 0; j < odd_el; j++) {
                    for (int k = 0; k < ever_el; k++) {
                        if(Math.abs(odd[j] - ever[k]) == 1) {
                            proverka = true;
                        }
                    }
                }
            }
            if(!proverka) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
