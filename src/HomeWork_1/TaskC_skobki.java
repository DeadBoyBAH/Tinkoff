package HomeWork_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskC_skobki {
    public static void main(String[] args) throws IOException {
        ArrayList<Character> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] text = reader.readLine().toCharArray();
        int proverka = 1;

        for (int i = 0; i < text.length; i++) {
            try {
                if (text[i] == '(' || text[i] == '[' || text[i] == '{') {
                    array.add(text[i]);
                } else if ((text[i] == ')' && array.get(array.size() - 1) == '(') || (array.get(array.size() - 1) == '[' && text[i] == ']')
                        || (array.get(array.size() - 1) == '{' && text[i] == '}') && !array.isEmpty()) {
                    array.remove(array.size() - 1);
                } else proverka = 0;
            } catch (IndexOutOfBoundsException e) {
                proverka = 0;
            }
        }

        if(!array.isEmpty()) proverka = 0;

        if (proverka == 0) {
            System.out.println("no");
        } else System.out.println("yes");
    }
}
