package Tasks_13_03_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] number = new int[n];

        boolean odd = false, even = false;

        String[] stroka2 = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(stroka2[i]);
            if(number[i] % 2 == 0) even = true;
            else odd = true;
        }

        if(odd && even) {
            Arrays.sort(number);
        }

        for (int x : number) {
            System.out.print(x + " ");
        }
    }
}
