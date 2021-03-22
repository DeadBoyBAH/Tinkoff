package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_F_chislo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int l = 1;
        int r = 1000000;
        int count = 0;
        while(r - l > 1 && count < 25) {
            int mid = (r + l)/2;
            System.out.println(mid);
            System.out.flush();
            String znak = reader.readLine();
            if(znak.equals(">=")) l = mid;
            else r = mid;
            count++;
        }
        System.out.println("! " + l);
    }
}
