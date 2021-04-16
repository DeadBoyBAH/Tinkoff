package HomeWork5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskA_Perestanovka {
    public static void main(String[] args) throws IOException {
            String[] text = new String[2];
            File file = new File("nextperm.in");
            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                if(i != 2) {
                    text[i] = line;
                }
                i++;
                line = reader.readLine();
            }

        String[] array_String = text[1].split(" ");

        int[] array = new int[array_String.length];
        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.parseInt(array_String[j]);
        }
        
        boolean proverka = false;
        int a1,a2;
        for (int j = array.length - 2; j >= 0; j--) {
            if (array[j] < array[j+1]) {
                a1 = j;
                a2 = j + 1;
                for (int k = array.length - 1; k >= a2; k--) {
                    if (array[k] > array[a1]) {
                        int tmp = array[a1];
                        array[a1] = array[k];
                        array[k] = tmp;
                        break;
                    }
                }
                boolean is_sorted = false;
                while(!is_sorted) {
                    is_sorted = true;
                    int k = a2;
                    while (k < array.length - 1) {
                        if (array[k] > array[k + 1]) {
                            int tmp = array[k];
                            array[k] = array[k + 1];
                            array[k + 1] = tmp;
                            is_sorted = false;
                        }
                        k++;
                    }
                }
                proverka = true;
                break;
            }
        }
        FileWriter fw = new FileWriter(new File("nextperm.out"));
        List<Integer> list = new ArrayList<>();
        for (int x : array) {
            list.add(x);
        }
        if (!proverka) {
            Collections.reverse(list);
        }


        for (int j = 0; j < array.length; j++) {
            fw.write(list.get(j) + " ");
            fw.flush();
        }

    }
}
