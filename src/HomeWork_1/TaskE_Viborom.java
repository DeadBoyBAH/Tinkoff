package HomeWork_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskE_Viborom {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int array[] = new int[n];

        String numbers[] = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < n; i++) {
            int number = i;
            for (int j = i+1; j < n; j++) {
                if(array[j] < array[number]) {
                    number = j;
                }
            }
            int tmp = array[i];
            array[i] = array[number];
            array[number] = tmp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
