package HomeWork5;

import java.io.*;

public class TaskD_cochetania {

    static FileWriter fw;

    static {
        try {
            fw = new FileWriter(new File("D:\\Tinkoff\\src\\HomeWork5\\hello2.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean pr = true;

    static void rec(int idx, int n, int m, int[] a) throws IOException {
        //if (!pr) return;
        if (idx == n) {
            for (int x : a) {
                System.out.print(x + " ");
                fw.write(x + " ");
                fw.flush();
            }
            System.out.println();
            fw.write("\n");
            return;
        }
        for (int i = 1; i <= m; i++) {
            //pr = true;
            a[idx] = i;
            if (idx !=0 && a[idx] >= a[idx-1]) break;
            rec(idx + 1, n, m, a);
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Tinkoff\\src\\HomeWork5\\hello.txt");
        FileReader fr = new FileReader(file);

        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();

        int n = Integer.parseInt(line.split(" ")[0]);
        int m = Integer.parseInt(line.split(" ")[1]);
        int[] a = new int[n];


        rec(0, n, m, a);
    }
}
