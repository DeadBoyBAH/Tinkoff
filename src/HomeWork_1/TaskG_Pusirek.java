package HomeWork_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskG_Pusirek {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int array[] = new int[n];

        String numbers[] = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        boolean is_sorted = false;

        while(!is_sorted) {
            int i = 0;
            is_sorted = true;
            while(i < n-1) {
                if(array[i] > array[i+1]) {
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    is_sorted = false;
                }
                i++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
