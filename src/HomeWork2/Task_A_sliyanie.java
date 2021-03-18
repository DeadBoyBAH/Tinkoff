package HomeWork2;

import java.util.Arrays;

public class Task_A_sliyanie {
    static public int[] sortArray(int[] array) {

        if(array.length == 1) {
            return array;
        } else {
            int[] array1 = Arrays.copyOf(array, array.length/2);
            int[] array2 = Arrays.copyOfRange(array, array.length/2, array.length);
            array1 = sortArray(array1);
            array2 = sortArray(array2);
            int[] result = new int[array1.length + array2.length];
            int i = 0, j = 0;

            for (int k = 0; k < result.length; k++) {
                if(i != array1.length && j != array2.length) {
                    if (array1[i] > array2[j]) {
                        result[k] = array2[j];
                        j++;
                    } else if (array1[i] <= array2[j]) {
                        result[k] = array1[i];
                        i++;
                    }
                } else if(j != array2.length) {
                    result[k] = array2[j];
                    j++;
                } else if(i != array1.length) {
                    result[k] = array1[i];
                    i++;
                }
            }
            return result;
        }
    }
    public static void main(String[] args) {

        int[] array3 = {1, 7, 4, 5, 3, 6, 10, 11, 2, 10};
        array3 = sortArray(array3);

        for (int x : array3) {
            System.out.print(x + " ");
        }
    }
}
