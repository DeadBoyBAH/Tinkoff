package HomeWork5;

import java.io.*;

public class TaskC_bezedinic {
    static FileWriter fw;

    static {
        try {
            fw = new FileWriter(new File("fibseq.out"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void rec(int idx, int n, int m, int[] a) throws IOException {
        if (idx == n) {
            for (int i = 1; i < a.length; i++) {
                if (a[i] == a[i - 1] && a[i] == 1) {
                    return;
                }
            }
            for (int x : a) {
                fw.write(x + " ");
                fw.flush();
            }
            fw.write("\n");
            return;
        }
        for (int i = 0; i < m; i++) {
            a[idx] = i;
            rec(idx + 1, n, m, a);
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("fibseq.in");
        FileReader fr = new FileReader(file);

        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        int n = Integer.parseInt(line);
        int m = 2;
        int[] a = new int[n];


        rec(0, n, m, a);
    }
}
