package HomeWork_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskF_vstavka {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int array[] = new int[n];

        String numbers[] = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j - 1] = tmp;
                }
            }
        }

        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
