package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_B_podschet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String text[] = reader.readLine().split(" ");
        int[] array = new int[20001];

        for (int i = 0; i < n; i++) {
                array[Integer.parseInt(text[i]) + 10000]++;
        }

        for (int i = 0; i < 20001; i++) {
                while(array[i] > 0) {
                    System.out.print((i - 10000) + " ");
                    array[i]--;
                }
        }
    }
}
