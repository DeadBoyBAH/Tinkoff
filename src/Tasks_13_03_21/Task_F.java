package Tasks_13_03_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_F {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] stroka = reader.readLine().split(" ");
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(stroka[i]);
        }

        Arrays.sort(array);

        for (int i = 0; i < n-1; i += 2) {
            int tmp = array[i];
            array[i] = array[i+1];
            array[i+1] = tmp;
        }


        if(array.length == 1) System.out.println("0");
        else if(array.length % 2 == 0) System.out.println(array.length/2 - 1);
        else System.out.println(array.length/2);
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
