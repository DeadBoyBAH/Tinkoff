package HomeWork5;

import java.io.*;

public class TaskE_ponomeru {

    public static int factl(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        String[] text = new String[2];
        File file = new File("bynumber.in");
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

        int n = Integer.parseInt(text[0]);
        int k = Integer.parseInt(text[1]);

        int[] array = new int[n];
        int[] used = new int[n];

        for (int j = 0; j < n-1; j++) {
            for (int l = 0; l < n; l++) {
                if (used[l] != 1) {
                    if (k >= factl(n - j - 1)) {
                        k -= factl(n-j-1);
                    }
                    else {
                        array[j] = l + 1;
                        used[l] = 1;
                        break;
                    }
                }
            }
        }

        for (int j = 0; j < n; j++) {
            if(used[j] == 0) {
                array[n-1] = j+1;
            }
        }

        FileWriter fw = new FileWriter(new File("bynumber.out"));
        for (int j = 0; j < array.length; j++) {
            fw.write(array[j] + " ");
            fw.flush();
        }

    }
}
