package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_C_NoteBool {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        NoteBook[] nb = new NoteBook[n];

        for (int i = 0; i < n; i++) {
            String[] text = reader.readLine().split(" ");
            nb[i] = new NoteBook(Integer.parseInt(text[0]), Integer.parseInt(text[1]));
        }

        Arrays.sort(nb);

        boolean proverka = false;
        for (int i = 0; i < n - 1; i++) {
            if(nb[i].quality > nb[i+1].quality) {
                proverka = true;
                break;
            }
        }
        if(proverka) System.out.println("Happy Alex");
        else System.out.println("Poor Alex");
    }
}

class NoteBook implements Comparable<NoteBook> {
    int cost;
    int quality;

    public NoteBook(int cost, int quality) {
        this.cost = cost;
        this.quality = quality;
    }

    @Override
    public int compareTo(NoteBook o) {
        return this.cost - o.cost;
    }
}
