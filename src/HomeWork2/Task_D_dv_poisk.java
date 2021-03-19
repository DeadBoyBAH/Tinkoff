package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_D_dv_poisk {
    static public int binary_poisk(int[] array, int start, int end, int element) {
        if(end >= start) {
            int middle = start + (end - start)/2;

            if(array[middle] == element) return middle;

            if(array[middle] > element) return binary_poisk(array, start, middle - 1, element);

            else if(middle != array.length - 1) return binary_poisk(array, middle + 1, end, element);
        }

        return -1;
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
            if (binary_poisk(array1, 0, n, array2[i]) != -1) {
                System.out.println("YES");
            } else System.out.println("NO");
        }

        System.out.println(5/2);


    }

}
