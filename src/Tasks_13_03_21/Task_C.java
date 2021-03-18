package Tasks_13_03_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroka1[] = reader.readLine().split(" ");
        int sila = Integer.parseInt(stroka1[0]);
        int n = Integer.parseInt(stroka1[1]);

        int[] array_sila = new int[n];
        int[] array_bonus = new int[n];

        for (int i = 0; i < n; i++) {
            String[] stroka2 = reader.readLine().split(" ");
            array_sila[i] = Integer.parseInt(stroka2[0]);
            array_bonus[i] = Integer.parseInt(stroka2[1]);
        }

        boolean is_sorted = false;

        while(!is_sorted) {
            int i = 0;
            is_sorted = true;
            while(i < n-1) {
                if(array_sila[i] > array_sila[i+1]) {
                    int tmp = array_sila[i];
                    array_sila[i] = array_sila[i+1];
                    array_sila[i+1] = tmp;

                    int tmp2 = array_bonus[i];
                    array_bonus[i] = array_bonus[i+1];
                    array_bonus[i+1] = tmp2;

                    is_sorted = false;
                }
                i++;
            }
        }

        boolean proverka = true;

        for (int i = 0; i < n; i++) {
            if(sila > array_sila[i]) {
                sila += array_bonus[i];
            } else {
                proverka = false;
                break;
            }
        }

        if(proverka) System.out.println("YES");
        else System.out.println("NO");

    }
}
