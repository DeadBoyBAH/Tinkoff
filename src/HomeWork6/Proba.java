package HomeWork6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Proba {

    static int myHash(char[] ch, int start, int end, int[] p) {
        int hash = 0;
        for (int i = start; i < end; i++) {
            hash += (int) ch[i] * p[i];
        }
        return hash;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text1 = reader.readLine();
        String text2 = reader.readLine();
        int p = 127;
        int r = (int) (Math.pow(10, 9) + 7);
        ArrayList<Integer> list = new ArrayList();
        int n = text1.length();
        int m = text2.length();

        int[] ps = new int[n];

        for (int i = 0; i < n; i++) {
            ps[i] = (int) (Math.pow(p, i)%r);
        }

        char[] char1 = text1.toCharArray();
        char[] char2 = text2.toCharArray();

        int hash2 = myHash(char2, 0, char2.length, ps)%r;

        System.out.println(hash2);
        System.out.println(text2.hashCode());

        System.out.println(myHash(char1, 0,8 , ps)%r - myHash(char1, 0, 5, ps)%r);
        System.out.println(hash2*ps[5]);

        for (int x : ps) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < n - m; i++) {
            if(myHash(char1, i, i+m, ps)%r == hash2*ps[i]) {
                list.add(i);
            }
        }

        System.out.println(list);






        /*int hashT1 = String.valueOf(text1.toCharArray(), 0, m).hashCode();
        int hashT2 = String.valueOf(text2.toCharArray(), 0, m).hashCode();
        for (int i = 0; i <= n - m; i++) {
            if(hashT1 == hashT2) {
                list.add(i);
            }
            if (i != n - m) hashT1 = (int) (p * hashT1 - Math.pow(p, m) * String.valueOf(text1.toCharArray(),i, 1).hashCode() + String.valueOf(text1.toCharArray(), i+m, 1).hashCode())%r;
        }

        for (int x : list) {
            System.out.print(x + " ");
        }*/


    }
}
